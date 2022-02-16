import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter sequence length: ");
        int sequenceLength = input.nextInt();

        int firstNumber = 0;
        int secondNumber = 1;
        int sum =0;
        String sequence = "0 1";

        for (int i = 1; i < sequenceLength; i++) {
            sequence += " " + (firstNumber+secondNumber);

            sum = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = sum;
        }

        System.out.println(sequence);
    }
}
