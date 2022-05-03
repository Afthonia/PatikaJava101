import java.util.Scanner;

public class FaceDownTriangle {
    public static void magicTriangle(int num) {
        for (int i=num ; i>=1 ; i--) {
            for (int j=num-i ; j>=0 ; j--) {
                System.out.print(" ");
            }

            for (int k=(2*i)-1 ; k>=1 ; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int number;

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        number = scan.nextInt();

        magicTriangle(number);
    }
}
