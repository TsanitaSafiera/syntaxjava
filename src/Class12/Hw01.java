package Class12;

public class Hw01 {
    public static void main(String[] args) {
        /*
        Create a String and if the String is not empty perform the following:
        if the String has an odd number of characters and has 3 or more
        characters, print the middle character of that String.
        example: String str=hello --> l
         */
        String strWord = "Ambulance";
        if (!strWord.isBlank()){
            if (strWord.length()%2 == 1 && strWord.length()>=3){
                System.out.println(strWord.charAt((strWord.length()-1)/2));
            }
        }
    }
}
