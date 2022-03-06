import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        String userName, password, currentUserName = "Patika", currentPassword = "Java101";

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your username: ");
        userName = input.nextLine();

        System.out.print("Please enter your password: ");
        password = input.nextLine();

        if (userName.equals(currentUserName) && password.equals(currentPassword)) {
            System.out.println("You logged in!");
        } else {
            System.out.println("One or all your entries are wrong :(");
            System.out.print("Do you want to reset your password? ");
            String answer = input.nextLine();
            if (answer.equals("yes") || answer.equals("YES") || answer.equals("Yes") || answer.equals("yep") || answer.equals("YEP") || answer.equals("Yep")) {
                System.out.print("Please enter your new password (make sure not to type your previous password): ");
                String newPassword = input.nextLine();

                if (newPassword.equals("Java101")) {
                    System.out.print("I warned you :(");
                } else {
                    currentPassword = newPassword;
                    System.out.println("Congrats! You just changed your password!");
                }
            } else {
                System.out.println("As you wish!");
            }
        }


    }
}
