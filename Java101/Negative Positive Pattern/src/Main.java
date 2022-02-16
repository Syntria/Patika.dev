import java.util.Scanner;

public class Main {
    static void pattern (int number, int newNumber, boolean isNegativeReached) {

        System.out.print(newNumber + " ");

        if (newNumber > 0 && !isNegativeReached) {
            pattern(number, newNumber-5,false);
        }

        else if (newNumber != number) {
            pattern(number,newNumber+5,true);
        }

    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int n = input.nextInt();

        pattern(n, n,false);

    }
}
