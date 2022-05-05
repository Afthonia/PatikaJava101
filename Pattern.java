import java.util.Scanner;

public class Pattern {
    public static String pattern(int startNum, int num, int state) {

        //-5 means it's going down, +5 means it's going up
        if (num <= 0 && state < 0) {
            return num + " " + pattern(startNum, num + 5, +1);
        }
        else if(num>0 && state > 0) {
            if (num == startNum) {
                return num + "";
            }
            return num + " " + pattern(startNum, num + 5, +1);
        }
        else {
            return num + " " + pattern(startNum, num - 5, -1);
        }
    }

    public static void main(String[] args) {
        int startNumber;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome! \nToday we're gonna make some patterns with numbers.");
        System.out.print("Give me the start point: ");
        startNumber = scan.nextInt();

        System.out.println(pattern(startNumber, startNumber, -1));
    }
}
