import java.util.Scanner;

public class PlaneTickets {
    public static void main(String[] args) {
        int distance, age, type;
        double ticket, km=0.10;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the length of your way: ");
        distance = input.nextInt();

        System.out.print("Please enter your age: ");
        age = input.nextInt();

        System.out.println("1: One Way \n2: Round-trip");
        System.out.print("Please enter the travel type: ");
        type = input.nextInt();

        if (distance<=0 || age<=0 || (type!=1 && type!=2)) {
            System.out.println("Your input is invalid");
        } else {
            ticket = km * distance;
            if (age<12) {
                ticket /= 2;
            } else if (age<=24) {
                ticket *= 0.90;
            } else if (age>65) {
                ticket *= 0.70;
            }
            if (type == 2) {
                ticket *= 0.80;
            }
            System.out.println("Your ticket is $" + ticket);
        }


    }
}
