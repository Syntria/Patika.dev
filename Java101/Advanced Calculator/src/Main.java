import java.util.Scanner;

public class Main {

    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". number: ");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Result: " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many number(s) will you enter: ");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number: ");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Result: " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". number: ");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Result: " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many number(s) will you enter: ");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number: ");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Divisior can't be 0");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Result: " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the base value: ");
        int base = scan.nextInt();
        System.out.print("Please enter exponent value: ");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result: " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Result: " + result);
    }

    static void mode() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = scan.nextInt();

        System.out.print("Please enter the modular: ");
        int mod = scan.nextInt();

        System.out.println("Result: " + (n % mod));
    }

    static void rectangleAreaAndPerimeter () {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the length of the long side: ");
        int longSide = scan.nextInt();

        System.out.print("Please enter the length of the short side: ");
        int shortSide = scan.nextInt();

        System.out.println("Area of the rectangle: " + (longSide*shortSide));
        System.out.println("Perimeter of the rectangle: " + (2*longSide+2*shortSide));
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Addition\n"
                + "2- Subtraction\n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "5- Exponential\n"
                + "6- Factorial\n"
                + "7- Modding\n"
                + "8- Rectangle Operations\n"
                + "0- Exit";

        do {
            System.out.println(menu);
            System.out.print("Please select an operation: ");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mode();
                case 8:
                    rectangleAreaAndPerimeter();
                case 0:
                    break;
                default:
                    System.out.println("You have entered invalid number, please try again.");
            }
        } while (select != 0);


    }
}
