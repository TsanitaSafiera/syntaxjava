package Class13;

public class Task3 {
    public static void main(String[] args) {

        // Create a string that should be combination of letters, numbers and
        // special characters. find out how many alphabets(abd AZ)
        // characters are there in the string.

        String str="abcdefgABCDEFG1234567!@#$%^&*";
        String str1=str.replaceAll("[^a-zA-Z]","");
        System.out.println(str1);
        System.out.println(str1.length());
        //below is the simpler code
        System.out.println(str.replaceAll("[^a-zA-Z]","").length());



    }
}
