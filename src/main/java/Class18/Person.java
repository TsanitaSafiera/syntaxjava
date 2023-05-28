package Class18;

public class Person {
    String name;

    void sleep(){
        System.out.println("ZZzzzzzzzz....");
    }
}


class Employee extends Person {

}

class Tester extends Employee {

}

class PersonTester{
    public static void main(String[] args) {
        Employee employee=new Employee();
        Tester tester=new Tester();
        tester.name="Sarah";
        employee.sleep();


    }
}