import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter how many numbers will you enter: ");
        int[] userArray = new int [input.nextInt()];

        System.out.println();

        for (int i = 0; i < userArray.length; i++) {
            System.out.print((i+1) + ". number: ");
            userArray[i] = input.nextInt();
        }

        Arrays.sort(userArray);

        for (int value : userArray) {
            System.out.print(value + " ");
        }

    }
}
