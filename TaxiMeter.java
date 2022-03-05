import java.util.Scanner;

public class TaxiMeter {
    public static void main(String[] args) {
        double kmPrice = 2.20, start = 10, km, total;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter how many kilometers you took: ");
        km = input.nextDouble();
        total = start + (km * kmPrice);
        System.out.println("The price will be $" + ((total < 20) ? "20" : total));
    }
}
