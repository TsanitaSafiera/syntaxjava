package Class18HW;

public class Teacher {
    // Write a Java program called Teacher.  Identify features and 4 behaviour
    // of that Class. Create 3 subclasses MathTeacher, ChemistryTeacher
    // and PianoTeacher . Test all 4 classes

    String name;
    int age;
    int grades;
    int yearsOfExperience;

    void teaching(){
        System.out.println(name + " has been teaching " + grades + " grades students for " + yearsOfExperience+ " years");
    }
    void writing(){
        System.out.println(name + " is writing a test case for " + grades + " grade classes ");
    }
    void grading(){
        System.out.println(name+ " who is turning " + age + " is grading quizzes for " + grades + " grades ");
    }
    void doingPresentation(){
        System.out.println(name + " is doing presentation for "+ grades + " grades students");
    }

    public Teacher(String name, int age, int grades, int yearsOfExperience) {
        this.name = name;
        this.age = age;
        this.grades = grades;
        this.yearsOfExperience = yearsOfExperience;
    }
}
class MathTeacher extends Teacher{
    public MathTeacher(String name, int age, int grades, int yearsOfExperience) {
        super(name,age,grades,yearsOfExperience);
    }
}

class ChemistryTeacher extends Teacher{
    public ChemistryTeacher(String name, int age, int grades, int yearsOfExperience) {
        super(name,age,grades,yearsOfExperience);
    }

}

class PianoTeacher extends Teacher{
    public PianoTeacher(String name, int age, int grades, int yearsOfExperience) {
        super(name,age,grades,yearsOfExperience);
    }

}

