import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter radius of circle:");
        double r = input.nextDouble();

        System.out.println("Please enter measure of the central angle:");
        double a = input.nextDouble();

        System.out.println("The area of circle piece is: " + (3.14*r*r*a)/360.0);
    }
}
