import java.util.Scanner;

public class Main {

    static void primeFinder(int number, int divider) {
        if(divider == 2)
            if (number % divider != 0)
                System.out.println(number + " is a prime number.");
            else
                System.out.println(number + " is not a prime number.");

        else {
            if (number % divider == 0)
                System.out.println(number + " is not a prime number.");
            else
                primeFinder(number, divider-1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int n = input.nextInt();

        primeFinder(n,n-1);


    }
}
