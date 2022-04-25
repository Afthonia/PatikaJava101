import java.util.Scanner;

public class ArmstrongNumbers {
    public static int powerCal(int base, int power) {
        int result = 1;

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= power; i++) {
            result *= base;
            //System.out.println(result);
        }

        return result;
    }
  
    public static void main(String[] args) {
        int digit = 0, result = 0, d, fakeNum;

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number you want to check: ");
        int num = scan.nextInt();
        fakeNum = num;

        while (fakeNum != 0) {
            fakeNum /= 10;
            digit++;
        }

        for (int i=1 ; i<=digit ; i++) {
            d = num % 10;
            result += powerCal(d, digit);
            num /= 10;
        }

        System.out.println("The sum is " + result);

        if (result == num) {
            System.out.println("Your number is an 'Armstrong Number' !!!");
        } else {
            System.out.println("Your number is NOT an 'Armstrong Number' :((");
        }
    }
}
