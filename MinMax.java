import java.util.Scanner;

public class MinMax {
    public static int min(int num, int[] numbers) {
        int min = numbers[0];

        for (int element : numbers) {
            if (element < min)
                min = element;
        }
        return min;
    }

    public static int max(int num, int[] numbers) {
        int max = numbers[0];

        for (int element : numbers) {
            if (element > max)
                max = element;
        }
        return max;
    }

    public static void main(String[] args) {
        int num;

        Scanner scan = new Scanner(System.in);
        System.out.print("How many number you will compare? ");
        num = scan.nextInt();

        int[] numbers = new int[num];

        for (int i=0 ; i<numbers.length ; i++) {
            System.out.print("Enter the " + (i+1) + ". number: ");
            int element = scan.nextInt();
            numbers[i] = element;
        }

        System.out.println("The greatest number is " + min(num, numbers));
        System.out.println("The smallest number is " + max(num, numbers));
    }
}
