import java.util.Scanner;

public class PowerOfTheNumber {
    public static void main(String[] args) {
        int result = 1;

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the base: ");
        int base = scan.nextInt();

        System.out.print("Please enter power: ");
        int pow = scan.nextInt();

        for (int i = 1; i <= pow; i++) {
            result *= base;
            //System.out.println(result);
        }

        System.out.println("The result is " + result + ".");
    }
}
