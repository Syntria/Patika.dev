import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while (right < 5) {
            System.out.print("Please enter your guess: ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Please enter a value between 0-100");
                if (isWrong) {
                    right++;
                    System.out.println("\n" + "You made too many incorrect entries. Remaining attempts: " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Your next wrong entry will be deducted from your attempts.");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Congratulations, your guess was correct! The number you guessed: " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Wrong guess!");
                if (selected > number) {
                    System.out.println(selected + " is bigger than secret number.");
                } else {
                    System.out.println(selected + " is smaller than secret number.");
                }

                wrong[right++] = selected;
                System.out.println("Remaining attempts: " + (5 - right));
                System.out.println();
            }
        }

        if (!isWin) {
            System.out.println("You lost the game!");
            if (!isWrong) {
                System.out.println("Your predictions: " + Arrays.toString(wrong));
            }
        }

    }
}
