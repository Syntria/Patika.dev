public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int examNote;
    int quizNote;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.examNote = 0;
        this.quizNote = 0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("Transaction completed.");
        } else {
            System.out.println(t.name + " can't give this course.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " will be given by : " + courseTeacher.name);
        } else {
            System.out.println("No one has been assigned to the " + this.name + " course");
        }
    }

    public void printGradeWeights () {
        System.out.println("Quiz: %20");
        System.out.println("Exam: %80");
    }
}
