package Class20HW;

public class Degree {
    /*Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
   Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
   Call the method by creating an object of each of the three classes.*/
    void getPrerequisite(){
        System.out.println("To get a degree you need a high school diploma");
    }
}
class Bachelor extends Degree{

}
class Masters extends Degree{
    @Override
    void getPrerequisite(){
        System.out.println("I already have high school diploma");}
}
class MasterTester{
    public static void main(String[] args) {
        Degree d=new Degree();
        d.getPrerequisite();
        Masters m=new Masters();
        m.getPrerequisite();
        Bachelor b=new Bachelor();
        b.getPrerequisite();

    }
}
