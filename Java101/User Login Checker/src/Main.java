import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your username: ");
        String username = input.nextLine();

        System.out.println("Please enter your password: ");
        String password = input.nextLine();


        System.out.println("Your username: ");
        String loginUsername = input.nextLine();

        System.out.println("Your password: ");
        String loginPassword = input.nextLine();

        if (username.equals(loginUsername) && password.equals(loginPassword))
        {
            System.out.println("Successfully logged in.");
        }

        else
        {
            System.out.println("Wrong username or password. Do you want to reset your password? (y-yes n-no)");

            String decision = input.nextLine();

            if (decision.equals("y"))
            {
                System.out.println("Please enter new your password:");

                String newPassword = input.nextLine();

                if (newPassword.equals(password))
                {
                    System.out.println("Your must enter a different password from your current password, please enter another password.");
                }

                else System.out.println("You have changed your password successfully.");
            }




        }



    }
}
