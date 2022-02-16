import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int math;
        int phy;
        int chem;
        int english;
        int history;
        int music;

        System.out.println("Please enter your Math grade: ");
        math = input.nextInt();
        System.out.println("Please enter your Physics grade: ");
        phy = input.nextInt();
        System.out.println("Please enter your Chemistry grade: ");
        chem = input.nextInt();
        System.out.println("Please enter your English grade: ");
        english = input.nextInt();
        System.out.println("Please enter your History grade: ");
        history = input.nextInt();
        System.out.println("Please enter your Music grade: ");
        music = input.nextInt();

        String result = (math+phy+chem+english+history+music)/6 > 60 ? "You passed.":"You failed.";

        System.out.println(result);






    }
}