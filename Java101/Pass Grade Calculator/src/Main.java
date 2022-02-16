import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double gradeSum = 0;
        double count = 0;

        System.out.println("Your Math grade: ");
        double mathGrade = input.nextInt();

        if(mathGrade>-1 && mathGrade<101) {
            gradeSum+=mathGrade;
            count+=1;
        }

        System.out.println("Your Physics grade: ");
        double physicsGrade = input.nextInt();

        if(physicsGrade>-1 && physicsGrade<101) {
            gradeSum+=physicsGrade;
            count+=1;
        }

        System.out.println("Your English grade: ");
        double englishGrade = input.nextInt();

        if(englishGrade>-1 && englishGrade<101) {
            gradeSum+=englishGrade;
            count+=1;
        }

        System.out.println("Your Chemistry grade: ");
        double chemistryGrade = input.nextInt();

        if(chemistryGrade>-1 && chemistryGrade<101) {
            gradeSum+=chemistryGrade;
            count+=1;
        }

        System.out.println("Your Music grade: ");
        double musicGrade = input.nextInt();

        if(musicGrade>-1 && musicGrade<101) {
            gradeSum+=musicGrade;
            count+=1;
        }

        if (gradeSum/count > 54) {
            System.out.println("You passed");
        }

        else {
            System.out.println("You failed");
        }

        System.out.println("Your grade is: " + (gradeSum/count));




    }
}
