import java.util.Scanner;

public class FindEvenUntil {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();

        for (n = 0; n <= num; n += 2) {
            System.out.println(n);
        }
    }
}
