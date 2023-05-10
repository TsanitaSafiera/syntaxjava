package Class17HW;

public class StudentsTester {
    public static void main(String[] args) {

        Students student1 = new Students("Tony", 89.5, 80.3, 79.7);
        System.out.println("Average mark of " + student1.studentName + " : " + student1.averageGrade());

        Students student2 = new Students("Roy", 80.8, 98.7, 89.6);
        System.out.println("Average mark of " + student2.studentName + " : " + student2.averageGrade());

        Students student3 = new Students("Maya", 90.7, 78.6, 86.5);
        System.out.println("Average mark of " + student3.studentName + " : " + student3.averageGrade());

        Students student4 = new Students("Caroline", 99.6, 90.5, 96.4);
        System.out.println("Average mark of " + student4.studentName + " : " + student4.averageGrade());

        Students student5 = new Students("Jade", 77.9, 80.9, 86.9);
        System.out.println("Average mark of " + student5.studentName + " : " + student5.averageGrade());
    }
}
