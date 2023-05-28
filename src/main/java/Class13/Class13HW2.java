package Class13;

import java.util.Scanner;

public class Class13HW2 {
    public static void main(String[] args) {
        System.out.println("This program finds out if a word is palindrome or not.");
        Scanner str = new Scanner(System.in);
        System.out.println("Please write a word");

        String wordTest = str.nextLine();

        int stringLength = wordTest.length();
        int halfLength = stringLength/2;
        boolean flag = true;

        for(int i=1; i<=halfLength;i++){
            if(wordTest.charAt(i-1) == wordTest.charAt(stringLength-i)){
                continue;
            }else{
                flag = false;
                break;
            }
        }
        if(flag == true){
            System.out.println(wordTest + "=>true");
        }else{
            System.out.println(wordTest + "=>false");
        }

    }
}
