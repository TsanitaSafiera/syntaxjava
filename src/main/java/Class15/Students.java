package Class15;

public class Students {/*
    Create a Class called Students
        Create three variables: Name, ID and numberOfStudents
        Create three objects of the Student Class
        Set the value for studentName, studentID, and increment the
        numberOfStudents for each object
        Print out total number of students
     */

    String studentName;
    String studentID;
    static int numberOfStudents;

    public Students(){
        numberOfStudents++;
    }

    public static void main(String[] args) {
        Students student1=new Students();
        student1.studentName="Wieke";
        student1.studentID="A1234T";

        Students student2=new Students();
        student2.studentName="Sheilla";
        student2.studentID="B456T";

        Students student3=new Students();
        student3.studentName="Widya";
        student3.studentID="C7891T";

        System.out.println(Students.numberOfStudents);
    }

}
