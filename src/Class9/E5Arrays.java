package Class9;

public class E5Arrays {
    public static void main(String[] args) {
    /*
    write a loop that starts from 0 and it goes
    \till number 5 and print only the even numbers

    create an array of chars and you have to print all the chars on even indexes
     */

        for (int i = 0; i <5; i++) {
            if(i%2==0) {
                System.out.println(i);
            }


        char [] chars={'A','B','C','D','E'};
        for (int j = 0; j <5; j++) {
            if(j%2==0) {

                System.out.println(chars[j]);
            }
            /* can also be written as this below
            for (int i = 0; i < chars.length; i+=2) {
                System.out.println(chars[i]);

             */

            }
        }
    }
}
