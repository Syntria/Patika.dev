import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter length of first edge");
        double firstEdge = input.nextDouble();

        System.out.println("Please enter length of second edge");
        double secondEdge = input.nextDouble();

        System.out.println("Please enter length of third edge");
        double thirdEdge = input.nextDouble();

        double u = (firstEdge+secondEdge+thirdEdge)/2.0;

        System.out.println(Math.sqrt(u*(u-firstEdge)*(u-secondEdge)*(u-thirdEdge)));
    }
}
