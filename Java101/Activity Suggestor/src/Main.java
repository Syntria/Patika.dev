import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter current temperature:");
        int temperature = input.nextInt();

        if (temperature < 5) {
            System.out.println("You can go to skiing.");
        }

        else if (temperature <= 15) {
            System.out.println("You can go to cinema.");
        }

        else if (temperature <= 25) {
            System.out.println("You can go to picnic.");
        }

        else {
            System.out.println("You can go to swimming.");
        }
    }
}
