package Class12;

public class E10StringDemo {
    public static void main(String[] args) {

        String name="LEANDRO";
        System.out.println(name.charAt(1));
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }



        String name1="LEANDROR";
        // count how many times the letter R has appeared

        int counter=0;
        for (int i = 0; i < name1.length(); i++) {
            if (name1.charAt(i) == 'R') {
                counter++;
            }


        }
        System.out.println(counter);

    }
}
