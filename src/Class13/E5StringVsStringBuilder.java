package Class13;

public class E5StringVsStringBuilder {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Java");
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.reverse());


        // to convert String to string builder
        String str1="Computer";
        StringBuilder str2=new StringBuilder(str1);
        System.out.println(str2);
        str2.reverse();
        // to restore the variable from string builder back to string
        str1=str2.toString();
        System.out.println(str1);



    }
}
