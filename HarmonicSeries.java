import java.util.Scanner;

public class HarmonicSeries {
    public static double harmonic(int num) {
        double sum = 0.0;

        for (int i=1 ; i<=num ; i++) {
            sum += (1.0/i);
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome! \nJust say the magic number and you will find your harmonic series!");
        System.out.print("\nPlease enter a number: ");

        int num = scan.nextInt();
        double result = harmonic(num);
        System.out.println("\nYour result is...\n");
        System.out.println(result);
        System.out.println("\nPlease come back again!");
    }
}
