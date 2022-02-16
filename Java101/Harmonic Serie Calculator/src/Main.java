import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double result = 0.0;

        System.out.println("Please enter a number: ");
        int number = input.nextInt();

        for (int i = 1; i <= number ; i++) {
            result += 1.0/i;
        }

        System.out.println("The result is: " + result);
    }
}
