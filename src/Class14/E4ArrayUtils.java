package Class14;

public class E4ArrayUtils {
    /*
    Create a method to add two int numbers and it should
    return the results back when called name of method should be add
     */
    /*
    return type=> int
    name of the method => add
    parameters => (int a, int b)
    body of the method => {
    int sum=a+b;
    return sum;
    }
     */
    int add(int a,int b){
        int sum=a+b;
        return sum;
    }

    public static void main(String[] args) {
        E4ArrayUtils obj=new E4ArrayUtils();
        // we are calling the add method on obj object passing two arguments one
        //is 10 other is 20 and storing the results from method call into the
        // sum variable
        int sum=obj.add(10,20);
        //System.out.println(obj.add(10,20)); => can also be written like this
        System.out.println(sum);
    }
}
