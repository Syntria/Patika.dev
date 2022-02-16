import java.util.Scanner;

public class MineSweeper {
    char[][] gameboard;
    boolean isGameFinished;
    Scanner input;

    MineSweeper(int row, int column) {
        this.gameboard = new char[row][column];

        for (int i = 0; i < gameboard.length; i++) {
            for (int j = 0; j < gameboard[0].length; j++) {

                this.gameboard[i][j] = '-';

                isGameFinished = true;
                input = new Scanner(System.in);
            }
        }
    }

    public void run() {

        initialGameboard();

        while (isGameFinished) {

            System.out.print("Please enter row: ");
            int row = input.nextInt();

            System.out.print("Please enter column: ");
            int column = input.nextInt();

            if(row >= this.gameboard.length || row < 0 ||
                    column >= this.gameboard[0].length || column < 0) {
                System.out.println();
                System.out.println("You have entered invalid position. Please re-enter the position.");
                System.out.println();
                printGameboard();
            }

            else {
                if (this.gameboard[row][column] == '*') {

                    System.out.println();

                    System.out.println("Game Over. You lost.");

                    printGameboardWithMines();

                    this.isGameFinished = false;
                }

                else {
                    this.gameboard[row][column] = (char) mineCounter(row,column);
                    printGameboard();

                    if (isGameboardFull()) {
                        System.out.println("Congratulations! You won!");
                        System.out.println();
                        printGameboardWithMines();
                        isGameFinished = false;
                    }
                }
            }
        }



    }

    public void printGameboard() {
        for (int i = 0; i < this.gameboard.length; i++) {
            for (int j = 0; j < this.gameboard[0].length; j++) {

                if (this.gameboard[i][j] == '*')
                {
                    System.out.print("- ");
                }

                else {
                    System.out.print(this.gameboard[i][j] + " ");
                }
            }

            System.out.println();

        }

        System.out.println();
    }

    public void printGameboardWithMines() {
        for (int i = 0; i < this.gameboard.length; i++) {
            for (int j = 0; j < this.gameboard[0].length; j++) {

                System.out.print(this.gameboard[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println();
    }

    public void initialGameboard() {
        int mineCount = (gameboard.length * gameboard[0].length) / 4 ;

        while (mineCount>0) {
            int randomRow = (int) (Math.random() * gameboard.length);
            int randomColumn = (int) (Math.random() * gameboard[0].length);

            if (this.gameboard[randomRow][randomColumn] == '-') {

                this.gameboard[randomRow][randomColumn] = '*';
                mineCount--;
            }
        }

        printGameboard();
    }

    public int mineCounter(int row, int column) {
        int startRow;
        int finishRow;
        int startColumn;
        int finishColumn;
        int mineCount = 0;

        if (row==0) {
            startRow = 0;
        }

        else {
            startRow = row-1;
        }

        if (row==this.gameboard.length-1) {
            finishRow = this.gameboard.length-1;
        }

        else {
            finishRow = row+1;
        }

        if (column==0) {
            startColumn = 0;
        }

        else {
            startColumn = column-1;
        }

        if (column==this.gameboard[0].length-1) {
            finishColumn = this.gameboard[0].length-1;
        }

        else {
            finishColumn = column+1;
        }

        for (int i = startRow; i <= finishRow; i++) {
            for (int j = startColumn; j <= finishColumn; j++) {
                if (this.gameboard[i][j] == '*') {
                    mineCount++;
                }
            }

        }

        return (char) (48 + mineCount);
    }

    public boolean isGameboardFull() {
        boolean isFull = true;

        for (int i = 0; i < this.gameboard.length; i++) {
            for (int j = 0; j < this.gameboard[0].length; j++) {

                if (gameboard[i][j] == '-') {
                    isFull = false;
                }
            }

        }

        return isFull;

    }
}




