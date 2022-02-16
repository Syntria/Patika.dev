import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int n1 = input.nextInt();

        System.out.println("Please enter second number: ");
        int n2 = input.nextInt();

        int i = 1;

        while (i <= n1*n2) {
            if (i % n1 == 0 && i % n2 == 0) {
                System.out.println("Greatest Common Divisor is: " + i);
                break;
            }

            i++;
        }

        System.out.println("Least Common Multiple is: " + n1*n2/i);
    }
}
