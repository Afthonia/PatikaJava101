import java.util.Scanner;

public class ZodiacSigns {
    public static void main(String[] args) {
        int month, day;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your birth month: ");
        month = input.nextInt();
        System.out.print(month<1 || month>12 ?"Invalid number": "");

        System.out.print("Please enter your birthday: ");
        day = input.nextInt();

        switch (month) {
            case 1:
                if (day<=21) {
                    System.out.println("Capricorn!");
                } else {
                    System.out.println("Aquarius!");
                }
                break;
            case 2:
                if (day<=19) {
                    System.out.println("Aquarius!");
                } else {
                    System.out.println("Pisces!");
                }
                break;
            case 3:
                if (day<=20) {
                    System.out.println("Pisces!");
                } else {
                    System.out.println("Aries!");
                }
                break;
            case 4:
                if (day<=20) {
                    System.out.println("Aries!");
                } else {
                    System.out.println("Taurus!");
                }
                break;
            case 5:
                if (day<=22) {
                    System.out.println("Taurus!");
                } else {
                    System.out.println("Gemini!");
                }
                break;
            case 6:
                if (day<=22) {
                    System.out.println("Gemini!");
                } else {
                    System.out.println("Cancer!");
                }
                break;
            case 7:
                if (day<=22) {
                    System.out.println("Cancer!");
                } else {
                    System.out.println("Leo!");
                }
                break;
            case 8:
                if (day<=22) {
                    System.out.println("Leo!");
                } else {
                    System.out.println("Virgo!");
                }
                break;
            case 9:
                if (day<=22) {
                    System.out.println("Virgo!");
                } else {
                    System.out.println("Libra!");
                }
                break;
            case 10:
                if (day<=22) {
                    System.out.println("Libra!");
                } else {
                    System.out.println("Scorpio!");
                }
                break;
            case 11:
                if (day<=21) {
                    System.out.println("Scorpio!");
                } else {
                    System.out.println("Sagittarius!");
                }
                break;
            case 12:
                if (day<=21) {
                    System.out.println("Sagittarius!");
                } else {
                    System.out.println("Capricorn!");
                }
                break;
        }
    }
}
