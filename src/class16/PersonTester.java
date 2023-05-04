package class16;

public class PersonTester {
    public static void main(String[] args) {
        Person person=new Person();
       // person.password="ksndks"; // cant be accessed because its private
        // person,printPassword(); cant be accessed as well
        // Person.printBalance();
        System.out.println(person.SSN); // default access
    }
}
