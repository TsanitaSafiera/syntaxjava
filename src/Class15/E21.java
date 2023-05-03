package Class15;

public class E21 {

    // create a method that takes an array as input. it adds all the numbers
    // from the array and returns the sum. name of the method should be sumArr
    // example = sumArr ({10,10,10}) => 30
    // sumArr({10,10,40}) => 60

    int sumArr(int [] arr){
        int sum=0;

        for (int i = 0; i < arr.length; i++) {
            sum=sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {


        E21 e2 = new E21();
        //int [] arr={10,10,10};
        int sum = e2.sumArr(new int[]{10, 10, 10});
        System.out.println(sum);
    }
}
