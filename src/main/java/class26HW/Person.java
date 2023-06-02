package class26HW;

import java.util.TreeMap;

public class Person {
    // Create a Person class with following private fields: name,
    // lastName, age, salary.
    //Variables should be initialized through constructor.
    //Inside the class also create a method to print user details.
    //In Test Class create a Map that will store key in ascending order.
    // In that map store personId and a Person Object. Print each object
    // details.

    private String name;
    private String lastName;
    private int age;
    private int salary;

    public Person(String name, String lastName, int age, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    void userDetail(){
        System.out.println(name + " "+lastName+ " "+ age +" "+ salary);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

class PersonTester {
    public static void main(String[] args) {
        TreeMap<String,Person> person= new TreeMap<>();

        Person person1=new Person("John","Doe", 45, 100000);
        Person person2=new Person("Carol","White",30,95000);

        person.put("1234", person1);
        person.put("5678", person2);

        for (var per : person.entrySet()) {
            String personKey=per.getKey();
            Person personVal=per.getValue();

            System.out.println(per);
            personVal.userDetail();

        }


    }
}
