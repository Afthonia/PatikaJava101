import java.util.Scanner;

public class Fibonacci {
    static int fibo(int num) {
        if (num == 1 || num == 2)
            return 1;
        return fibo(num-1) + fibo(num-2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter which fibonacci number you want to find:  ");
        int fibonacci = input.nextInt();

        System.out.println(fibo(fibonacci));
    }
}
