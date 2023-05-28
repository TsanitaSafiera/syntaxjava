package Class15;

public class SyntaxEmployee {
    //Create a Class called SyntaxEmployee:
    // create three  variables  empID , salary and set the CEO to “Sumair”
    //Create two objects of the class SyntaxEmployee
    //Set the value of eID, salary for each of the objects
    //Print out the eID , salary and  CEO for each of the objects

    String empID;
    double salary;
    static String CEO="Sumair";



    public static void main(String[] args) {
    SyntaxEmployee ashgar=new SyntaxEmployee();
    ashgar.empID="Ab12345";
    ashgar.salary=90000;
        //System.out.println(ashgar.CEO); // not preferred way
        System.out.println(SyntaxEmployee.CEO);

        SyntaxEmployee soheil=new SyntaxEmployee();
        soheil.empID="584685";
        soheil.salary=92000;
        System.out.println(soheil.empID);
        System.out.println(ashgar.empID);
    }

    }


