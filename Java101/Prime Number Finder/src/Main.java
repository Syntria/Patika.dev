import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = input.nextInt();

        boolean isPrime = true;

        for (int i = 2; i <= number; i++) {
            isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i%j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.print(i+", ");
            }
        }
    }
}
