package GroupProjectOOP;

public abstract class Marks {
    // We have to calculate the average of marks obtained in three subjects
    //by student A and by student B. Create class 'Marks' with an abstract
    //method 'getPercentage' that will be returning the average percentage
    //of marks. Provide implementation of abstract method in classes 'A'
    //and 'B'. The constructor of student A takes the marks in three
    //subjects as its parameters and the marks in four subjects as its
    //parameters for student B. Test your code

    double gradeA;
    double gradeB;
    double gradeC;

    public Marks(double gradeA, double gradeB, double gradeC) {
        this.gradeA = gradeA;
        this.gradeB = gradeB;
        this.gradeC = gradeC;
    }
    abstract double getPercentage();

}
class A extends Marks{


    public A(double gradeA, double gradeB, double gradeC) {
        super(gradeA,gradeB,gradeC);
    }

    @Override
    double getPercentage() {
        double mark=((gradeA+gradeB+gradeC)/3);

        System.out.println("The Average mark of student A is : "+mark);
        return mark;
    }
}
class B extends Marks{

    double gradeD;
    public B(double gradeA, double gradeB, double gradeC,double gradeD) {
        super(gradeA,gradeB,gradeC);
        this.gradeD=gradeD;
    }
    @Override
    double getPercentage() {
        double mark=((gradeA+gradeB+gradeC+gradeD)/4);

        System.out.println("The Average mark of student B is : "+mark);
        return mark;

    }
}
class MarkTester{

    public static void main(String[] args) {

        A a=new A(80,90,70);
        B b=new B(90,70,80,90);

        a.getPercentage();
        b.getPercentage();
    }
}