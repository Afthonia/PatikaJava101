import java.util.Scanner;

public class SumOddNumbers {
    public static void main(String[] args) {
        int num;
        int sum = 0;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Enter a number: ");
            num = scan.nextInt();

            if (num % 2 == 1)
                sum += num;
        } while (num>0);

        System.out.println("Total : " + sum);
    }
}
