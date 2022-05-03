import java.util.Scanner;

public class FibonacciSeries {
    public static int fibonacci(int num) {
        if (num == 1)
            return 0;
        if (num == 2)
            return 1;
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static void main(String[] args) {
        int number;
        String answer;

        Scanner scan = new Scanner(System.in);

        System.out.println("Hellooo!");
        System.out.println("You know the fibonacci series, right?");
        System.out.println("I want to surprise you a little. \nNow, you'll give me the order and I'll tell you the fibonacci number int that order.");

        do {
            System.out.print("Say the magical number :)  ");
            number = scan.nextInt();

            System.out.println("The magi- I mean, the fibonacci number is.. \n" + fibonacci(number) + " ! \nBeautiful, isn't it?");
            System.out.print("\nDo you want to try again? ");
            answer = scan.next();

        } while (answer.equalsIgnoreCase("yes"));

        System.out.println("See you again, sweetie!");
    }
}
