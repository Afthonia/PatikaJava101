import java.util.Scanner;

public class Combination {
    public static int factorial(int num) {
        int product = 1;

        for (int i=num ; i>0 ; i--) {
            product *= i;
        }

        return product;
    }
    public static double combination(int x, int y) {
        double com = factorial(x) / ((factorial(y) * factorial(x-y)));
        return com;
    }
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        int num1 = scan.nextInt();

        System.out.print("Please enter the second number: ");
        int num2 = scan.nextInt();

        System.out.println("The result is " + combination(num1, num2));
    }
}
