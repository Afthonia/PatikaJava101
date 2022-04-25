import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int product = 1;

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number whose factorial you want to calculate: ");
        int num = scan.nextInt();

        for (int i=num ; i>0 ;i--) {
            product *= i;
            //System.out.println(product);
        }

        System.out.println("Factorial is " + product);
    }
}
