import java.util.Scanner;

public class GcfLcm2 {
    public static int gcf(int num1, int num2) {
        int gcf = 1;
        int divider = 1;
        if (num1 < num2) {
            while (divider <= num1) {
                if (num1 % divider == 0)
                    gcf = divider;
                    divider++;
            }
            return gcf;

        } else {
            while (divider <= num2) {
                if (num2 % divider == 0)
                    gcf = divider;
                    divider++;
            }
            return gcf;
        }
    }

    public static int lcm(int num1, int num2) {
        int lcm = 1;
        int multiplier = 1;

        while (multiplier <= num1*num2) {
            if ((multiplier * num2) % num1 == 0) {
                lcm = multiplier * num2;
                break;
            }
            multiplier++;
        }
        return lcm;
    }

    public static void main(String[] args) {
        int num1, num2, select;

        Scanner input = new Scanner(System.in);
        System.out.println("First of all, what should I call you? ");
        String name = input.next();

        System.out.println("\nWelcome, " + name + "!");
        System.out.println("Let's do some mathematics, shall we? Can you help me out a litte ?");
        System.out.println("I need two numbers, so I ask of you to give them to me. \n");

        System.out.print("First number, please: ");
        num1 = input.nextInt();

        System.out.print("Second number, please: ");
        num2 = input.nextInt();

        System.out.println("\nNow, what do you want me to calculate ? ");
        System.out.println("\n1. GCF (Greatest Common Factor)" +
                "\n2. LCM (Least Common Multiple)");
        System.out.print("Make your choice : ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("The greatest common factor (GCF) is " + gcf(num1, num2));
                break;
            case 2:
                System.out.println("The least common multiple (LCM) is " + lcm(num1, num2));
                break;
            default:
                System.out.println("\nSince you didn't give me a clear answer, I'll calculate both. ");
                System.out.println("Here we go... \n");
                System.out.println("The greatest common factor (GCF) is " + gcf(num1, num2));
                System.out.println("The least common multiple (LCM) is " + lcm(num1, num2));
        }
        System.out.println("Don't make me cry, come visit again!");
    }
}
