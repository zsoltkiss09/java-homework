import java.sql.SQLOutput;

public class MainBattle {
    static Alien alien = new Alien();
    static Human human = new Human();

    public static void main(String[] args) {
        System.out.println("***Alien attack***");
        alienAttack();
        System.out.println("--------------------------------------------------------");

        System.out.println("***Human attack wave 1***");
        humanAttack();
        System.out.println("--------------------------------------------------------");

        System.out.println("***Human attack wave 2***");
        humanAttack();
        System.out.println("--------------------------------------------------------");
    }

    public static void humanAttack() {
        System.out.println("Alien health is: " + alien.getHealth());
        System.out.println("Human's remaining ammo: " + human.getAmmo());

        alien.setHealth();

        System.out.println("Alien health is: " + alien.getHealth());
        System.out.println("Human's remaining ammo: " + human.getAmmo());
    }

    public static void alienAttack() {
        System.out.println("Human health is: " + human.getHealth());
        System.out.println("Alien energy is: " + alien.getEnergy());

        human.setHealth();

        System.out.println("Human health is: " + human.getHealth());
        System.out.println("Alien energy is: " + alien.getEnergy());


    }
}
