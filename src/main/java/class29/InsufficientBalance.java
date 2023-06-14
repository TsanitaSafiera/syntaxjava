package class29;

public class InsufficientBalance extends RuntimeException {
    /***

     This exception is thrown when there is no enough balance in the users
     account
     and he tries to withdraw more money.
     */

    public InsufficientBalance(String errorMsg) {
        super(errorMsg);
    }


}
