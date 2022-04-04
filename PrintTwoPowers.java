import java.util.Scanner;

public class PrintTwoPowers {
    public static void main(String[] args) {
        int power = 1;
        int number;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();

        for (int i=0 ; i>=0 ; i++) {
            System.out.println(power);
            power *= 2;

            if (power >= number)
                break;
        }
    }
}
