import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        int num1, num2;
        String sign;
        Scanner input = new Scanner(System.in);

        System.out.print("Please select the first number: ");
        num1 = input.nextInt();

        System.out.print("Please select the second number: ");
        num2 = input.nextInt();

        System.out.print("Please select the operator you want to use: ");
        sign = input.next();

        switch (sign) {
            case "+" -> System.out.println(num1 + num2);
            case "-" -> System.out.println(num1 - num2);
            case "*" -> System.out.println(num1 * num2);
            case "/" -> System.out.println(num1 / num2);
        }
    }
}
