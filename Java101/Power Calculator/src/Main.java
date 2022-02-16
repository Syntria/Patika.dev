import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 1;

        System.out.println("Please enter a number:");
        int number = input.nextInt();

        System.out.println("Please enter the power of number:");
        int power = input.nextInt();

        for (int i = 0; i < power; i++) {
            total*=number;
        }

        System.out.println(total);


    }
}
