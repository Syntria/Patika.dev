import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a word: ");
        String word = input.nextLine();
        String[] charArray = word.split("");
        boolean isPalindromic = true;

        for (int i = 0; i < charArray.length/2; i++) {
            if (!charArray[i].equals(charArray[charArray.length - 1 - i])) {
                isPalindromic = false;
                break;
            }
        }

        if (isPalindromic) {
            System.out.println(word + " is a palindromic word.");
        }

        else {
            System.out.println(word + " is not a palindromic word.");
        }


    }
}
