import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        int sum = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number whose digit numbers' sum you want to calculate: ");
        int num = scan.nextInt();

        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        System.out.println("The sum of your number's digits is " + sum);
    }
}
