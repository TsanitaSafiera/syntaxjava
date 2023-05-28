package Class7;

public class E12WhileLoop {
    public static void main(String[] args) {
        // add all the numbers from 1 to 10 and the result 55
        // first write a loop that goes from 1 to 10
        // create a variable to hold the sum and add all the numbers to that variable


        int counter=1;
        int sum=0;
        while (counter<=10){
            sum+=counter; //same as sum=sum+counter
            counter++;
        }
        System.out.println(sum);

    }
}
