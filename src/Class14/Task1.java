package Class14;

public class Task1 {

    //Write code that will take in a
    // String input and check to see if it is a palindrome or not.
    //A palindrome means that the characters are the same
    // forwards and backwards, ignoring spaces.

    // car => rac => not palindrome
    // Madam => madaM => it is palindrome

    boolean isPalindrome(String str){
        //String lowerCaseStr=str.toLowerCase();
        String reversedStr="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversedStr=reversedStr+str.charAt(i);
        }
        boolean isStrPalindrome=false;
        if(str.equalsIgnoreCase(reversedStr)){
            isStrPalindrome=true;
        }
        return isStrPalindrome;

    }
    boolean isPalindromeSB(String str){
        /*
        return new StringBuilder(str) => converts the string to a stringBuilder
        reverse()=> it reverses the contents in StringBuilder
        toString()=> it converts the StringBuilder back to a String
        equalsIgnoreCase(str)=> comparing the reversed String to original one
         */
        return new StringBuilder(str).reverse().toString().equalsIgnoreCase(str);

    }

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        boolean result = task1.isPalindrome("madam");
        System.out.println(result);
    }
}
