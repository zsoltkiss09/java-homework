public class Human implements Character {
    private int health = 100;
    private static int ammo = 200;

    public int getHealth() {
        return health;
    }

    public int setHealth() {
        health = health - Alien.biteHuman();
        if (health <= 0) {
            isDead();
        }
        return health;
    }

    @Override
    public boolean isDead() {
        System.out.println("The Human is Dead. RIP");
        return true;
    }

    public int getAmmo() {
        return ammo;
    }

    public static int shootAlien() {
        int damage;
        if (ammo >= 15) {
            damage = 25;
            ammo = ammo - 15;
        } else {
            damage = 0;
            System.out.println("Human is out of ammo. Supply immediately!");
        }
        return damage;
    }

}

