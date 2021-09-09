public class Alien implements Character {
    private int health = 200;
    private static int energy = 100;

    public int getHealth() {
        return health;
    }

    public int setHealth() {
        health = health - Human.shootAlien();
        if (health <= 0) {
            isDead();
        }
        return health;
    }

    public boolean isDead() {
        System.out.println("The Alien is Dead. RIP");
        return true;
    }

    public int getEnergy() {
        return energy;
    }

    public static int biteHuman() {
        int damage;
        if (energy >= 80) {
            damage = 25;
            energy = energy - 10;
        } else if (energy >= 50) {
            damage = 15;
            energy = energy - 10;
        } else {
            damage = 0;
            System.out.println(" Be aware - the Alien does not have enough energy!");
        }
        return damage;
    }
}
