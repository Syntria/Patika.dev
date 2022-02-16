import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int userInput = input.nextInt();

        System.out.println("Powers of 4:");

        for (int i = 1; i <= userInput ; i*=4) {
            System.out.println(i);
        }

        System.out.println("Powers of 5:");
        for (int i = 1; i <= userInput ; i*=5) {
            System.out.println(i);
        }

    }
}
