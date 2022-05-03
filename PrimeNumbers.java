import java.util.Scanner;

public class PrimeNumbers {
    public static boolean isPrime(int num) {
        boolean prime = true;
        if (num != 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0)
                    prime = false;
            }
        } else {
            return false;
        }
        return prime;
    }

    public static void printPrime(int first, int last) {
        for (int i=first ; i<=last ; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int num1, num2;

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome! \nYou'll define an interval and I'll write the prime numbers in it, OK?");
        System.out.println("Let's start!\n");

        System.out.print("Enter the starting point: ");
        num1 = scan.nextInt();

        System.out.print("Enter the second number: ");
        num2 = scan.nextInt();

        printPrime(num1, num2);
    }
}
