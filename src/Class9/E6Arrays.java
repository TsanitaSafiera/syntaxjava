package Class9;

public class E6Arrays {
    public static void main(String[] args) {
        /*
        create an array store 10,50,60,45,100 then print elements
        which is present on odd indexes
        expected output 50 45
         */

        int [] numbers={10,50,60,45,100};
        for (int i = 0; i < numbers.length; i++) {
            //you can also write for(int i=1; i< numbers.length; i+=2)
            //it starts from 1 so the i+2 becomes odd numbers
            if(i%2==1){ // you can also use if(i%2!=0)
                System.out.println(numbers[i]);
            }
        }
    }
}
