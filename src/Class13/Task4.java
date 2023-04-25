package Class13;

public class Task4 {
    public static void main(String[] args) {
        // You have a string a="Is it saturday? Is it raining?
        // do we have a Java Class today?"
        // how would you find out how many sentences are in that String?

        String a="Is it saturday? Is it raining? do we have a Java Class today?";
        String [] strArr=a.split("[.!?]");
        System.out.println(strArr.length);

        // how to get individual letter from a string in
        // the form of an array of characters
        char [] strCharArr=a.toCharArray();
        for (char c : strCharArr) {
            System.out.print(c+" ");

        }
    }
}
