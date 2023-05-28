package Class12;

public class E11StringDemo {
    public static void main(String[] args) {

        String name="Today is Saturday"; // a's in index 3 10 15

        //System.out.println(name.indexOf('i'));
        //System.out.println(name.indexOf('a'));
        // Start searching from index 4
        //System.out.println(name.indexOf('a',4));

        //print all the indexed wherever the letter a is appearing

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i)=='a') {
                System.out.print(i+" ");
                //System.out.print(name.charAt(i)); => to print the a's
            }


        }
    }
}
