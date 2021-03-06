import java.util.Scanner;

public class Calculator {
    static void add(int a, int b) {
        int result = a + b;
        System.out.println("The sum is " + result);
    }

    static void subt(int a, int b) {
        int result = a - b;
        System.out.println("The distinction is " + result);;
    }

    static void multiple(int a, int b) {
        int result = a * b;
        System.out.println("The result is " + result);
    }

    static void divide(double a, double b) {
        if (b == 0)
            System.out.println("Undefined");
        else {
            double result = a / b;
            System.out.println("The result is " + result);
        }
    }

    static void power(int base, int expo) {
        int result = 1;
        for (int i=1 ; i<=expo ; i++) {
            result *= base;
        }
        System.out.println("The result is " + result);
    }

    static void mod(int a, int b) {
        int result = a % b;
        System.out.println("The mod is " + result);
    }

    static void recArea(int edge1, int edge2) {
        int area = edge1 * edge2;
        System.out.println("The area is " + area);
    }

    static void recPerimeter(int edge1, int edge2) {
        int perimeter = 2 * (edge1 + edge2);
        System.out.println("The perimeter is " + perimeter);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int select;
        String menu = "1- Addition \n" +
                      "2- Subtraction \n" +
                      "3- Multiplication \n" +
                      "4- Division \n" +
                      "5- Power \n" +
                      "6- Mod \n" +
                      "7- Rectangle Area \n" +
                      "8- Rectangle Perimeter \n" +
                      "0- Exit";
        while (true) {
            System.out.println("\n" + menu);
            System.out.print("\nChoose an operation: ");
            select = inp.nextInt();

            if (select == 0)
                break;

            System.out.print("Please enter the " + ((select==7 || select == 8) ? "first edge: " : ((select == 5) ? "base: " : "first number: ")));
            int num1 = inp.nextInt();

            System.out.print("Please enter the " + ((select==7 || select == 8) ? "second edge: " : ((select == 5) ? "power: " : "second number: ")));
            int num2 = inp.nextInt();

            switch (select) {
                case 1 -> add(num1 , num2);
                case 2 -> subt(num1 , num2);
                case 3 -> multiple(num1 , num2);
                case 4 -> divide(num1 , num2);
                case 5 -> power(num1 , num2);
                case 6 -> mod(num1 , num2);
                case 7 -> recArea(num1 , num2);
                case 8 -> recPerimeter(num1, num2);
            }
        }
