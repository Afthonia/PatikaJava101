import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        double edge1, edge2, edge3, u, area;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter one of the edge's length: ");
        edge1 = input.nextDouble();

        System.out.print("Please enter a second one: ");
        edge2 = input.nextDouble();

        System.out.print("Please enter the last one: ");
        edge3 = input.nextDouble();

        u = (edge1 + edge2 + edge3)/2;

        area = Math.sqrt(u * (u-edge1) * (u-edge2) * (u-edge3));
        System.out.println("The area of the triangle is " + area);
    }


}
