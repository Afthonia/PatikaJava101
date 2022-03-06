import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        double height, mass, bmi;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your height (m): ");
        height = input.nextDouble();

        System.out.print("Please enter your mass (kg): ");
        mass = input.nextDouble();

        bmi = mass / (height * height);
        System.out.println("Your BMI (Body Mass Index) is " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        }
        else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Normal Weight");
        }
        else if (bmi >= 24.9 && bmi < 29.9) {
            System.out.println("Overweight");
        }
        else if (bmi >= 29.9) {
            System.out.println("Obese");
        }
    }
}
