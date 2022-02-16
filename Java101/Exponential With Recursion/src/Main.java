public class Main {
    static int exponential (int number, int exponential) {

        if (exponential == 0)
            return 1;

        else
            return number*exponential(number,exponential-1);


    }
    public static void main(String[] args) {

        System.out.println(exponential(5,4));

    }
}
