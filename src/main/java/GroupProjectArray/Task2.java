package GroupProjectArray;

public class Task2 {
    public static void main(String[] args) {
        // Create an array of integer values. After the array is
        //created, calculate the sum of all stored elements in
        //that array.

        int [] num={10,2,15,10,80,100};

        int sum=0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];

        }
        System.out.println(sum);
    }
}
