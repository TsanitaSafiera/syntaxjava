package Class6;

public class E1LogicalOperators1 {
    public static void main(String[] args) {
        double marksInMath=80;
        double marksInScience=95;

        /*for && you need both condition true cant be either one must
         be all true
         we use this operational to make sure everything is good

         */
        if(marksInMath>90 && marksInScience>90){
            System.out.println("You are a brilliant student ");
        }else{
            System.out.println("You need to work hard");
        }


    }

}
