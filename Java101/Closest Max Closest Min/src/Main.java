import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] list = {56, 34, 1, 8, 101, -2, -33};
        int n = 0;
        int max = 0;
        int min = 0;


        System.out.println("Please enter a number: ");
        n = input.nextInt();

        Arrays.sort(list);

        for (int i = list.length-1; i >=0 ; i--) {
            if (list[i] < n) {
                min = list[i];
                break;
            }
        }

        for (int i = 0; i < list.length; i++) {
            if (list[i] > n) {
                max = list[i];
                break;
            }
        }

        System.out.println("The minimum closest number is: " + min);
        System.out.println("The maximum closest number is: " + max);

    }
}
