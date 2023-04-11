package Class5;

public class E4NestedIf {
    public static void main(String[] args) {

        /* create a variable money store the value 20000 inside that variable
        write if-else condition money is greater than 10000 program should
        check another condition for example it should check what day is today
        if the day is sunday it should say lets go shopping
         */

        int money = 8000;
        String day = "monday";
        if (money > 10000) {
            if (day.equals("sunday")) {
                System.out.println("lets go shopping");
            } else {
                System.out.println("let's wait for Sunday");
            }
        }else{
            System.out.println("let's save more");
        }
    }
}
