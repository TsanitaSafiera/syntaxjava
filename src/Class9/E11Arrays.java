package Class9;

public class E11Arrays {
    public static void main(String[] args) {
        /*
        there are two ways of creating arrays
        1> datatype [] name={element 1, element 2, element 3};
        example int[] number={10,20,30}
        2> datatype [] name=new datatype[size]
        int [] numbers=new int [5]

        Enhanced for loop:
        its another type of loop that we can use with data structures its
        automatically picks the items from array and prints them one by one
        in each iteration.
        why should we use Enhanced?
        1> its cleaner code
        2> it's easier to understand.
        syntax:
        for(datatype variable:arrayName){
        }
        limitations of enhanced for loop:
        1> there is no index which means we will always get the data in
        the sequence it is present in the array
        2> we can't print the items in reverse order
        3> we can't update the values as well.




        new int[5]=> create an array of int with size 5
         */

        int [] numbers= new int[5];
            numbers[0]=50; // store 50 on index 2
            numbers[1]=60;
            numbers[2]=70;
            numbers[3]=80;
            numbers[4]=90;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");

        }
        //for (int number : numbers) {
            //System.out.println(number);


    }
}
