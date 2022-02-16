import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter first number");
        int firstNumber = input.nextInt();

        System.out.println("Please enter second number");
        int secondNumber = input.nextInt();

        System.out.println("Please enter third number");
        int thirdNumber = input.nextInt();

        if (firstNumber>secondNumber && firstNumber>thirdNumber) {
            if (secondNumber>thirdNumber) {
                System.out.println(firstNumber + ">" + secondNumber + ">" + thirdNumber);
            }
            else {
                System.out.println(firstNumber + ">" + thirdNumber + ">" + secondNumber );
            }
        }

        else if (secondNumber>firstNumber && secondNumber>thirdNumber) {
            if (firstNumber > thirdNumber) {
                System.out.println(secondNumber + ">" + firstNumber + ">" + thirdNumber);
            } else {
                System.out.println(secondNumber + ">" + thirdNumber + ">" + firstNumber);
            }
        }

        else {
            if (firstNumber > secondNumber) {
                System.out.println(thirdNumber + ">" + firstNumber + ">" + secondNumber);
            } else {
                System.out.println(thirdNumber + ">" + secondNumber + ">" + firstNumber);
            }
        }
    }
}
