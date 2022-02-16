import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter first number");
        double firstNumber = input.nextDouble();

        System.out.println("Please enter second number");
        double secondNumber = input.nextDouble();


        System.out.println("1-Addition \n2-Substraction \n3-Multiplication \n4-Division");
        int select = input.nextInt();

        switch (select){
            case 1:
                System.out.println("Result is : " + (firstNumber+secondNumber));
                break;

            case 2:
                System.out.println("Result is : " + (firstNumber-secondNumber));
                break;

            case 3:
                System.out.println("Result is : " + (firstNumber*secondNumber));
                break;
            case 4:
                System.out.println("Result is : " + (firstNumber/secondNumber));
                break;
        }


    }
}
