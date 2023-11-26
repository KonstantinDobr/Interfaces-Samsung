import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name, health and armor of the warrior");
        Warrior warrior = new Warrior(scanner.next(), scanner.nextInt(), scanner.nextInt());
        System.out.println("Enter the name, health and mana points of the mage");
        Mage mage = new Mage(scanner.next(), scanner.nextInt(), scanner.nextInt());
        System.out.println("Enter the name, health and luck of the outlaw");
        Outlaw outlaw = new Outlaw(scanner.next(), scanner.nextInt(), scanner.nextDouble());

        System.out.println();
        System.out.println("Great!");
        System.out.println();

        while (warrior.getHp() > 0 && (mage.getHp() > 0 || outlaw.getHp() > 0)) {
            System.out.println("Warrior attacks");
            warrior.doDmg(mage);
            warrior.doDmg(outlaw);
            System.out.println("Warrior hp: " + warrior.getHp() + "\t\t" + "Warrior armor: " + warrior.getArmor());
            System.out.println("Mage hp: " + mage.getHp() + "\t\t" + " Mage mp: " + mage.getMp());
            System.out.println("Outlaw hp: " + outlaw.getHp() + "\t\t" + " Outlaw luck: " + outlaw.getLuck());

            for (int i = 0; i < 30; i++) {
                System.out.print(".");
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println();

            System.out.println("Mage and outlaw attack");
            mage.doDmg(warrior);
            outlaw.doDmg(warrior);
            System.out.println("Warrior hp: " + warrior.getHp() + "\t\t" + "Warrior armor: " + warrior.getArmor());
            System.out.println("Mage hp: " + mage.getHp() + "\t\t" + " Mage mp: " + mage.getMp());
            System.out.println("Outlaw hp: " + outlaw.getHp() + "\t\t" + " Outlaw luck: " + outlaw.getLuck());

            for (int i = 0; i < 30; i++) {
                System.out.print(".");
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println();
        }

        if (warrior.getHp() <= 0) {
            System.out.println(mage.getName() + " and " + outlaw.getName() + " won!");
        } else {
            System.out.println(warrior.getName() + " won!");
        }
    }
}