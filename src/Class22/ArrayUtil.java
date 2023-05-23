package Class22;

public interface ArrayUtil {
    // create a method to get the average of numbers from an array
    // search array for te number if found return true
    // create a method that will Count the how many times the number
    // is appearing in an array

    public boolean searchArr(int [] array,int number);

    double getAvg(double[] arr);

    int getCount(double[] array, double number);
    int add(int num1, int num2);

}
class Main implements ArrayUtil{


    @Override
    public boolean searchArr(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number)
                return true;
        }
        return false;
    }

    @Override
    public double getAvg(double[] arr) {
        double sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+i;
        }
        return sum;
    }

    @Override
    public int getCount(double[] array, double number) {
        int sum=0;
        for (double v: array){
            if(v==number){
                sum++;
            }
        }
        return sum;

    }

    @Override
    public int add(int num1, int num2) {
        return num1+num2;
    }


}
