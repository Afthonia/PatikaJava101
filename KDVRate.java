import java.util.Scanner;

public class KDVRate {
    public static void main(String[] args) {
        double realPrice, kdvRate, kdvPrice, priceWithKDV;

        Scanner input = new Scanner(System.in);
        System.out.print("Pleace enter the real price: ");
        realPrice = input.nextDouble();
        kdvRate = (realPrice > 0 && realPrice <= 1000) ? 0.18 : 0.08;
        kdvPrice = realPrice * kdvRate;
        priceWithKDV = realPrice + kdvPrice;

        System.out.println("The price of the product without KDV is $" + realPrice);
        System.out.println("The KDV rate is " + kdvRate);
        System.out.println("The kdv is $" + kdvPrice);
        System.out.println("The price of the product with KDV is $" + priceWithKDV);
    }
}
