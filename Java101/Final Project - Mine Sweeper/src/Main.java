import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rowLength = 0;
        int columnLength = 0;

        while (rowLength <= 0) {

            System.out.print("Please enter row length (You have to enter a positive number): ");
            rowLength = input.nextInt();
        }

        while (columnLength <= 0) {

            System.out.print("Please enter column length (You have to enter a positive number): ");
            columnLength = input.nextInt();
        }

        System.out.println();


        MineSweeper game = new MineSweeper(rowLength, columnLength);

        game.run();

    }
}
