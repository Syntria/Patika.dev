import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double price;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your flight's distance:");
        int distance = input.nextInt();

        System.out.println("Please enter your age:");
        int age = input.nextInt();

        System.out.println("Please enter type of your ticket (1 => One Way, 2 => Two Way):");
        int ticketType = input.nextInt();

        if(age >= 0 && distance >0 && (ticketType > 0 && ticketType < 3))
        {
            price = distance * 0.1;
            if(age<12)
                price -= price * 0.5;
            else if(age<25)
                price -= price * 0.1;
            else if(age>65)
                price -= price * 0.3;

            if (ticketType==2)
            {
                price -= price * 0.2;
                price = price * 2;
            }
            System.out.println("Your ticket price is: " + price);
        }

        else
            System.out.println("You entered invalid information.");
    }
}
