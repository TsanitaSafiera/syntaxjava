package Class21;

public class Student {
    //Create a Class Student that will have 3 subclasses as SyntaxStudent,
    // CollegeStudent, SchoolStudent.
    // *Define 3 common behavior within parent class and override some of the
    // methods in child classes
    // *Define some methods specific to child classes
    // *Write example of achieving run time polymorphism
    String name;
    String lastName;
    int grade;

    public Student(String name, String lastName, int grade) {
        this.name = name;
        this.lastName = lastName;
        this.grade = grade;
    }

    void learn(){
        System.out.println("Students are learning");
    }
    void speak(){
        System.out.println("Students are speaking");
    }
    void listen(){
        System.out.println("Students are listening");
    }

}
class SyntaxStudent extends Student{
    public SyntaxStudent(String name, String lastName, int grade) {
        super(name,lastName,grade);
    }
    @Override
    void learn(){
        System.out.println("Syntax Students are learning");
    }
    @Override
    void speak(){
        System.out.println("Syntax Students are speaking");
    }@Override
    void listen(){
        System.out.println("Syntax Students are listening");
    }
    void groupProject(){
        System.out.println( "Syntax students doing group projects");
    }
}
class CollegeStudent extends Student {
    public CollegeStudent(String name, String lastName, int grade) {
        super(name, lastName, grade);
    }
        @Override
        void learn() {
            System.out.println("College Students are learning");
        }
        @Override
        void speak () {
            System.out.println("College Students are speaking");
        }
        @Override
        void listen () {
            System.out.println("College Students are listening");
        }
        void dancing () {
            System.out.println("College students are dancing");
        }

    }

    class SchoolStudent extends Student {
        public SchoolStudent(String name, String lastName, int grade) {
            super(name, lastName, grade);
        }

        @Override
        void learn() {
            System.out.println("School Students are learning");
        }

        @Override
        void speak() {
            System.out.println("School Students are speaking");
        }

        @Override
        void listen() {
            System.out.println("School Students are listening");
        }

    }

class pollyE2 {
    public static void main(String[] args) {
        Student[] students = {new SyntaxStudent("lely", "Smith", 11),
                new CollegeStudent("Moly", "Brown", 20), new SchoolStudent("John", "Doe", 13)};

        for (Student student : students) {

            if (student instanceof SyntaxStudent) { // checking and then type casting
            ((SyntaxStudent) student).groupProject();
            }else if (student instanceof CollegeStudent){
            ((CollegeStudent)student).dancing();
        }

            student.learn();
            student.speak();
            student.listen();
        }
        Student syntax= new SchoolStudent("John", "Doe", 13);
        if(syntax instanceof SyntaxStudent){
            ((SyntaxStudent)syntax).groupProject();
        }else{
            System.out.println("Wrong type of object is present in syntax var cast");
        }


        Student student = new SyntaxStudent("lely", "Smith", 11);
        SyntaxStudent s = (SyntaxStudent) student;
        s.groupProject();
    }



}
