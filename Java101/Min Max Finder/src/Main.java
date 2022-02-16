import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int min,max;
        int userInput;

        System.out.print("How many numbers will you enter: ");
        int count = input.nextInt();
        System.out.println();

        System.out.print("Please enter 1. number: ");
        min= input.nextInt();
        max= min;

        for (int i = 2; i <= count; i++) {
            System.out.print("Please enter " + i + ". number: ");
            userInput = input.nextInt();

            if (userInput>max) {
                max  = userInput;
            }

            if (userInput<min) {
                min = userInput;
            }
        }

        System.out.println();
        System.out.println("Smallest number: " + min);
        System.out.println("Largest number: " + max);
    }
}
