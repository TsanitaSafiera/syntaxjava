package Class18HW;

public class TeacherTester {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Maria", 28, 9, 3);
        MathTeacher math = new MathTeacher("John",34,7,10);
        ChemistryTeacher chem = new ChemistryTeacher("suzie", 26, 5, 6);
        PianoTeacher piano = new PianoTeacher("Anderson", 40, 8, 18);

        teacher.teaching();
        math.writing();
        chem.grading();
        piano.doingPresentation();
    }
}
