import java.util.Scanner;

public class GreengrocerySimulator {
    public static void main(String[] args) {
        double PEAR = 2.14, APPLE = 3.67, TOMATO = 1.11, BANANA = 0.95, EGGPLANT = 5.00, total;
        int pear, apple, tomato, banana, eggplant;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter how many pear you bought: ");
        pear = input.nextInt();

        System.out.print("Please enter how many apple you bought: ");
        apple = input.nextInt();

        System.out.print("Please enter how many tomato you bought: ");
        tomato = input.nextInt();

        System.out.print("Please enter how many banana you bought: ");
        banana = input.nextInt();

        System.out.print("Please enter how many eggplant you bought: ");
        eggplant = input.nextInt();

        total = (pear * PEAR) + (apple * APPLE) + (tomato * TOMATO) + (banana * BANANA) + (eggplant * EGGPLANT);
        System.out.println("$" + total + " please!");
    }
