import java.util.Scanner;

public class ATMSwitch {
    public static void main(String[] args) {
        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;

        Scanner scan = new Scanner(System.in);

        while (right > 0) {
            System.out.print("Username: ");
            userName = scan.next();

            System.out.print("Password: ");
            password = scan.next();

            if (userName.equals("patika") && password.equals("java101")) {
                System.out.println("\nYou've logged in! \n");
                System.out.println("Hello, " + userName + "! \nWelcome to XX Bank. \n");
                do {
                    System.out.println("1. Pay in money \n" +
                            "2. Withdraw money \n" +
                            "3. Balance inquiry \n" +
                            "4. Exit \n");

                    System.out.print("Please choose the operation you want to perform : ");

                    select = scan.nextInt();

                    switch (select) {
                        case 1 :
                            System.out.print("\nPlease enter the amount you want to pay in : ");
                            int amount = scan.nextInt();
                            balance += amount;

                            break;
                            
                        case 2 :
                            System.out.print("\nPlease enter the amount you want to withdraw : ");
                            amount = scan.nextInt();

                            if (amount > balance) {
                                System.out.println("\nYou don't have enough money.");
                            } else {
                                balance -= amount;
                            }

                        case 3 :
                            System.out.println("\nYou have " + balance + "₺ in your account.");
                            
                    }
                }
                
                while (select != 4);
                System.out.println("\nSee you later!");
                break;
            } else {
                right--;
                System.out.println("Wrong password or username.");
                System.out.println("You have " + right + " right left.");
                if (right == 0) {
                    System.out.println("Your account got blocked! Please try to get connected with your customer representative.");
                } else {
                    System.out.println("Please try again!");
                }
            }
        }
    }
}
