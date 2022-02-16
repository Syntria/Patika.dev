public class Student {
    String name,stuNo;
    int classes;
    Course math;
    Course phy;
    Course chem;
    double average;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course math,Course phy,Course chem) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.math = math;
        this.phy = phy;
        this.chem = chem;
        calcAvarage();
        this.isPass = false;
    }


    public void addExamNotes(int mathExam, int mathQuiz, int phyExam, int phyQuiz, int chemExam, int chemQuiz) {

        if (mathExam >= 0 && mathExam <= 100) {
            this.math.examNote = mathExam;
            this.math.quizNote = mathQuiz;
        }

        if (phyExam >= 0 && phyExam <= 100) {
            this.phy.examNote = phyExam;
            this.phy.quizNote = phyQuiz;
        }

        if (chemExam >= 0 && chemExam <= 100) {
            this.chem.examNote = chemExam;
            this.chem.quizNote = chemQuiz;
        }

    }


    public void isPass() {
        if (this.math.examNote == 0 || this.phy.examNote == 0 || this.chem.examNote == 0) {
            System.out.println("Missing grade.");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Average : " + this.average);
            if (this.isPass) {
                System.out.println("Passed. ");
            } else {
                System.out.println("Failed.");
            }
        }
    }

    public void calcAvarage() {
        this.average = ((this.phy.examNote + this.chem.examNote + this.math.examNote) / 15)*4 +
                (this.phy.quizNote + this.chem.quizNote + this.math.quizNote) / 15;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.average > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Student : " + this.name);
        System.out.println("Mathematics Grade : " + (this.math.examNote * 4 / 5 + this.math.quizNote / 5));
        System.out.println("Physics Grade : " + (this.phy.examNote * 4 / 5 + this.phy.quizNote / 5));
        System.out.println("Chemistry Grade : " + (this.chem.examNote * 4 / 5 + this.chem.quizNote / 5));
    }
}
