import java.util.Scanner;

public class DiamondWithStars {
    public static void magicalDiamond(int num) {
        for (int i=1 ; i<num ; i++) {
            for (int j=num-i ; j>=0 ; j--){
                System.out.print(" ");
            }

            for (int k=1; k <= (2*i)-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=num ; i>=1 ; i--) {
            for (int j=0 ; j<=num-i ; j++){
                System.out.print(" ");
            }

            for (int a=(2*i)-1 ; a>=1 ; a--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome!");
        System.out.println("I'll make some magic in a few ticks XD");
        System.out.println("All you need to do is give me a hand or two :D");
        System.out.print("\nNow, please enter a natural number: ");

        int num = scan.nextInt();

        magicalDiamond(num);
      
        System.out.println("Do you like it?");
    }
}
