package Class20;

public class School {
    String schoolName;

    int batch;

    int year;

    String lastDayOfClass;

    School(){

    }

    School(String schoolName, int batch, int year, String lastDayOfClass){
        this.schoolName=schoolName;
        this.batch=batch;
        this.year=year;
        this.lastDayOfClass=lastDayOfClass;
    }
    void print(){
        System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
    }
}
class MainTester{
    public static void main(String[] args){
        School obj=new School();
        School obj1=new School("Syntax",6,2020,"07/30/2020");
        obj.print();
        obj1.print();

    }

}
