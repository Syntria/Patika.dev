import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your height (in meters):");
        double height = input.nextDouble();

        System.out.println("Please enter your weight:");
        double weight = input.nextDouble();

        System.out.println("Your BMI is: " + weight/(height*height));
    }
}
