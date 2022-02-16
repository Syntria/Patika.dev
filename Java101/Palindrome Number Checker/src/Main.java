public class Main {
    static boolean isPalindrome (int number) {
        int temp = number;
        int lastNumber = 0;
        int reversedNumber = 0;

        while (temp!=0) {
            lastNumber = temp % 10;
            reversedNumber = reversedNumber * 10 + lastNumber;
            temp /= 10;
        }

        return reversedNumber == number;
    }

    public static void main(String[] args) {

    }
}
