package class16;

public class Task1 {
    // Create a method that will accept an array as parameters and will
    // return a sum of all elements from that array. Method should be
    // visibly only within same package and accessible by the creating
    // an instance of the class.

    int sumArray (int [] arr){
        int sum=0;
        for (int num:arr) {
            sum = sum + num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Task1 obj= new Task1();
        int [] arr1={1,2,3,4};
        int result=obj.sumArray(new int []{1,2,3,4});
        System.out.println(result);
    }
}
