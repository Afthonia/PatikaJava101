package Practices;

import java.util.Scanner;

public class PrintFourFivePowers {
    public static void main(String[] args) {
        int pow4 = 4, pow5 = 5;
        int number;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = scan.nextInt();
        System.out.println(1);

        for (int i=1 ; i>0 ; i++) {
            if (pow4 < number) {
                System.out.println(pow4);
                pow4 *= 4;
            }

            if (pow5 < number) {
                System.out.println(pow5);
                pow5 *= 5;
            }

            if (pow4 >= number && pow5 >= number)
                break;
        }
    }
}
