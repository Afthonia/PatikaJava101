import java.util.Scanner;

public class AverageScore2 {
    public static void main(String[] args) {
        // create the variables
        int math, turk, chem, physics, music;
        double div = 5;

        // define the scanner class
        Scanner input = new Scanner(System.in);

        // get the values from the user
        System.out.print("Please enter your Math score: ");
        math = input.nextInt();

        System.out.print("Please enter your Turkish score: ");
        turk = input.nextInt();

        System.out.print("Please enter your Chemistry score: ");
        chem = input.nextInt();

        System.out.print("Please enter your Physics score: ");
        physics = input.nextInt();

        System.out.print("Please enter your Music score: ");
        music = input.nextInt();

        if (math<0 || math>100) {
            div--;
        }
        if (turk<0 || turk>100) {
            div--;
        }
        if (chem<0 || chem>100) {
            div--;
        }
        if (physics<0 || physics>100) {
            div--;
        }
        if (music<0 || music>100) {
            div--;
        }

        math = (math<0 || math>100) ? 0: math;
        turk = (turk<0 || turk>100) ? 0 : turk;
        chem = (chem<0 || chem>100) ? 0 : chem;
        physics = (physics<0 || physics>100) ? 0 : physics;
        music = (music<0 || music>100) ? 0 : music;


        int sum = math + turk + chem + physics + music;
        double average = sum / div;
        System.out.println("Your average of scores is " + average);
        System.out.println((average >= 55) ? "You passed!" : "You failed :(");

    }
}
