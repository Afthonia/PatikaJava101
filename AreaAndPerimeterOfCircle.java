import java.util.Scanner;

public class AreaAndPerimeterOfCircle {
    public static void main(String[] args) {
        double r, area, perimeter, PI = 3.14;
        //r = radius

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the radius of the circle: ");
        r = input.nextDouble();

        area = PI * r * r;
        perimeter = 2 * PI * r;

        System.out.println("The area of the circle is " + area);
        System.out.println("The perimeter of the circle is " + perimeter);
    }
