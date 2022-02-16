import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        System.out.println("Please enter a number:");
        int userInput = input.nextInt();

        for (int i = 1; i <= userInput; i++) {
            if (i % 12 == 0) {
                sum+=i;
                count+=1;
            }

        }

        System.out.println(sum/count);
    }
}
