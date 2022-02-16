import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);

        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Please enter your username: ");
            userName = input.nextLine();
            System.out.print("Please enter your password: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Welcome to the bank!");
                do {
                    System.out.println("1-Deposit\n" +
                            "2-Withdraw\n" +
                            "3-Balance Check\n" +
                            "4-Exit");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    switch (select) {
                        case 1 -> {
                            System.out.print("Amount: ");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        }
                        case 2 -> {
                            System.out.print("Amount: ");
                            int price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Insufficient balance");
                            } else {
                                balance -= price;
                            }
                            break;
                        }
                        case 3 -> System.out.println("Your Balance: " + balance);
                    }
                } while (select != 4);
                System.out.println("See you again!");
                break;
            } else {
                right--;
                System.out.println("Incorrect username or password, please try again");
                if (right == 0) {
                    System.out.println("Your account has been blocked. Please contact to bank");
                } else {
                    System.out.println("Remaining attempts: " + right);
                }
            }
        }
    }
}
