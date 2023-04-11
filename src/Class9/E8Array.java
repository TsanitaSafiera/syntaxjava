package Class9;

public class E8Array {
    public static void main(String[] args) {

        // print all numbers from 6 to 0 in reverse order
        // {'A','B','C','D','E','F'}
        // 6 5 4 3 2 1 0

        char [] numbers={'A','B','C','D','E','F'};
        for (int i = 5; i >=0; i--) {
            // you can also write for (int i=numbers.length-1; i>=0; i--)
            // we subtracting 1 (number.length-1) so that we dont get index out of bound
            // because index always start at 0
            System.out.println(i+" "+numbers[i]);

        }
    }
}
