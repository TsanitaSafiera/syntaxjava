package Class8;

public class E13NestedLoops2 {
    public static void main(String[] args) {

        /*
        1 2 3 4 5
        2 3 4 5 6
        3 4 5 6 7
         */

        for (int i = 0; i <3; i++) {
            for (int j = 1; j <=5; j++) {
                System.out.print(i+j+" ");

            }
            System.out.println();


        }
    }
}
