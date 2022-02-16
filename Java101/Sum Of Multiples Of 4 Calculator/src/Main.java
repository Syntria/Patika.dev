import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int userInput = 0;

        do {

            System.out.println("Please enter a number:");
            userInput = input.nextInt();

            if (userInput % 4 ==0){
                sum += userInput;
            }

        }

        while (userInput % 2 == 0);

        System.out.println(sum);
    }
}
