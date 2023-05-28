package Class8;

public class E3ForLoop {
    public static void main(String[] args) {

        // write a loop to add all the even numbers from 1 to 30

        int sum=0; // creating a variable to hold the sum
        for(int i=1; i<=30; i++){
            if(i%2==0){ // checking if a number is even
                sum=sum+i; // sum+=: adding all the even numbers to the sum variable one by one
            }
            //sout inside the curly brackets only if we want to check
            // each iteration of the loop
        }
        System.out.println(sum); //this is printed outside the curly bracket
        //because we only need the final result
    }
}
