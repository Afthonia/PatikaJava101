import java.util.Scanner;

public class PerfectNumber {

    //Perfect number is the number which its positive divisors' sum equals to the number itself
    public static boolean isPerfect(int num) {
        int sum = 0;

        for (int i=1 ; i<num ; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Please enter a number: ");
            num = scan.nextInt();

            if (num == 0) {
                System.out.println("Zero is not a perfect number!");
            } else {
                if (isPerfect(num))
                    System.out.println(num + " is a perfect number!");
                else
                    System.out.println(num + " is not a perfect number :(");
            }
        } while (num != 0);
    }
}
