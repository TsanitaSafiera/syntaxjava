package Class21;

public class Parent {

    final int noOfMonthsInYear=12; // no one can change the value of this final
  final void getMarry(){ // final method can't be override by child class
        System.out.println("Marry Shakira");
    }
    void study(){
        System.out.println("Study medicine");
    }
}
class Axel extends Parent {
    final int noOfHoursInaDay=24;
    @Override
    void study(){
        System.out.println(noOfMonthsInYear);
        System.out.println("No i want SDET");
    }

}
