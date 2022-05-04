import java.util.Scanner;

public class PowerOfTheNumber2 {
    public static int power(int base, int pow) {
        if (pow == 0)
            return 1;
        return base * power(base, pow-1);
    }

    public static void main(String[] args) {
        int base, pow;

        Scanner scan = new Scanner(System.in);
        System.out.println("Let's calculate the power of a number! \n");
        System.out.print("Gimme the base: ");
        base = scan.nextInt();

        System.out.print("Gimme the power: ");
        pow = scan.nextInt();

        System.out.println("The result is " + power(base, pow));
    }
}
