import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the year you want to control: ");
        year = input.nextInt();

        if (year % 4 == 0) {
            if (year % 100 != 0) {
                System.out.println("It's a leap year!");

            } else {
                if (year%400==0) {
                    System.out.println("It's a leap year!");
                } else {
                    System.out.println("Unfortunately, it's not a leap year :(");
                }

            }
        } else {
            System.out.println("Unfortunately, it's not a leap year :(");
        }
    }
}
