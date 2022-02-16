import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your product's price");
        double price = input.nextDouble();

        double multiplier = price >1000? 8.0/100.0 : 18.0/100.0;

        System.out.println("Price: " + price);
        System.out.println("Price with KDV: "+(price+(price*multiplier)));
        System.out.println("KDV: " + price*multiplier);


    }
}
