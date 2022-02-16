import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter how many kilometers did you traveled:");
        double kmTraveled = input.nextDouble();

        double debt =(kmTraveled*2.20)+10 > 20 ? (kmTraveled*2.20)+10 : 20;

        System.out.println("Your Dept is : " + debt);
    }
}
