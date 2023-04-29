package Class14;

public class E5ArrayUtils {
    // create a method, call it contains. it should take an array of int and
    //an int number in the method body. it should search the array for that
    //number, is present in the array method should return true, otherwise method
    //should return false. in separate class call the method and test it for
    // below input {10,20,45} number 20

    /*
    return type => boolean
    name of method => contains
    parameters => int [] arr, int num
    body {
    for (int i=0; i<arr.length; i++){

    }
     */

    boolean contains(int [] arr, int num) {
        boolean isFound = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==num){
                isFound=true;
                break;
            }

        }
        return isFound;
    }

}
/*
public static void main(String[] args) {
        int [] arr= {10,20,45};
        int num = 20;
        P7 obj = new P7();
        boolean result = obj.contains(arr, num);
        System.out.println("Search result = "+ result);
    }
    boolean contains(int [] array, int num) {
        boolean res = false;
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                res = true;
            }
        }
        return res;
    } (edited)

 */