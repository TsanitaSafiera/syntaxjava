package Class17HW;

public class Students {
    //  Write a java Class Students that have a constructor which takes
    //  students name and 3 subject grades. Inside your class also have
    //  a method to Calculate Average Grade. Test Student class for 5
    //  different students with different marks. Your program should print
    //  an average mark of each students name.

    String studentName;
    double mathGrade;
    double chemistryGrade;
    double biologyGrade;


    public Students(String studentName, double mathGrade, double chemistryGrade, double biologyGrade) {
        this.studentName = studentName;
        this.mathGrade = mathGrade;
        this.chemistryGrade = chemistryGrade;
        this.biologyGrade = biologyGrade;
    }

    double averageGrade() {
        return (mathGrade + chemistryGrade + biologyGrade) / 3;
    }
}
