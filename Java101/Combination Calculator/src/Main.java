import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 1;

        System.out.println("Please enter n:");
        int n = input.nextInt();

        System.out.println("Please enter r:");
        int r = input.nextInt();

        for (int i = 1; i <= n; i++) {
            total *= i;
        }

        for (int i = 1; i <= r; i++) {
            total /= i;
        }

        for (int i = 1; i <= n-r; i++) {
            total/=i;
        }

        System.out.println(total);


    }
}
