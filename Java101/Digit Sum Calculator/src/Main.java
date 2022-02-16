import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        System.out.println("Please enter a number: ");
        String number = input.nextLine();

        for (int i = 0; i < number.length(); i++) {
            sum += Integer.parseInt(number.substring(i,i+1));
        }

        System.out.println("The sum of the digit(s) is: " + sum);
    }
}
