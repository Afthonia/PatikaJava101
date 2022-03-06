import java.util.Scanner;

public class OfferForWeather {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the heat (C): ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("You can do skiing");
        } else if (heat >= 5 && heat < 15){
            System.out.println("You can go to the cinema");
            if (heat >= 10) {
                System.out.println("You can have a picnic");
            }
        } else if (heat >= 15 && heat < 25) {
            System.out.println("You can have a picnic");
        } else if (heat >= 25) {
            System.out.println("You can swim");
        } else {
            System.out.println("You better stay at home..");
        }
    }
}
