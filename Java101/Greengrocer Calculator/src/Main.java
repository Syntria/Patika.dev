import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How much tomatoes did you buy? (in kg)");
        double tomatoes = input.nextDouble();

        System.out.println("How much apples did you buy? (in kg)");
        double apples = input.nextDouble();

        System.out.println("How much bananas did you buy? (in kg)");
        double bananas = input.nextDouble();

        System.out.println("How much pears did you buy? (in kg)");
        double pears = input.nextDouble();

        System.out.println("How much eggplants did you buy? (in kg)");
        double eggplants = input.nextDouble();

        System.out.println("Your total dept is: " + ((pears*2.14) + (apples*3.67) + (tomatoes*1.1) +
                (bananas*0.95) +(eggplants*5.00)));
    }
}
