import java.util.Scanner;

public class PalindromeNumbers {
    int[] nums;
    static boolean isPalindrome(int num) {
        int temp = num, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            System.out.println(temp);
            lastNumber = temp%10;
            System.out.println(lastNumber);
            reverseNumber = (reverseNumber * 10) + lastNumber;
            System.out.println(reverseNumber);
            temp /= 10;

        }
        if (reverseNumber != num) 
            return false;
        
        return true;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = input.nextInt();

        System.out.println(isPalindrome(number));
    }
}
