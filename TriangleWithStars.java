import java.util.Scanner;

public class TriangleWithStars {
    public static void magicalTriangle(int num) {
        for (int i=1 ; i<=num ; i++) {
            for (int j=num-i ; j>=0 ; j--){
                System.out.print(" ");
            }

            for (int k = 1; k <= (2*i)-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome!");
        System.out.println("We'll make some magic in a few ticks XD");
        System.out.println("All you need to do is give us a hand or two :D");
        System.out.print("\nNow, please enter a natural number: ");

        int num = scan.nextInt();

        magicalTriangle(num);
    }
}
