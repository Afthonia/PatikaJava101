import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {
        // create the variables
        int math, turk, hist, physics, geo, bio;

        // define the scanner class
        Scanner input = new Scanner(System.in);

        // get the values from the user
        System.out.print("Please enter your Math score: ");
        math = input.nextInt();

        System.out.print("Please enter your Turkish score: ");
        turk = input.nextInt();

        System.out.print("Please enter your History score: ");
        hist = input.nextInt();

        System.out.print("Please enter your Physics score: ");
        physics = input.nextInt();

        System.out.print("Please enter your Geometry score: ");
        geo = input.nextInt();

        System.out.print("Please enter your Biology score: ");
        bio = input.nextInt();
        
        int sum = math + turk + hist + physics + geo + bio ;
        double average = sum / 6.0;
        System.out.println("Your average of scores is " + average);
        System.out.println((average >= 60) ? "You passed!" : "You failed :(");

    }
}
