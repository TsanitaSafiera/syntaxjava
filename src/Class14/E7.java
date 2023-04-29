package Class14;

public class E7 {
    // Create a method that will take 2 parameters as a numbers
    // and prints which number is larger.

    void printLarger(int a, int b){
        if (a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
        //System.out.println(Math.max(a,b)); => you can also write like this

    }

    public static void main(String[] args) {
        E7 obj=new E7();
        obj.printLarger(7,8);
    }
}
