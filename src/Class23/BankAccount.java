package Class23;

public class BankAccount {
    String firstName;
    private String userName;
    private String password;
    private double accountBalance = 120;

    public BankAccount(String userName, String password) {
        this.userName = userName;
        this.password = password;

    }
    String getFirstName(){
        return firstName;
    }
    // get keywords is used to access the private information
    public double getAccountBalance(String password) {
        if (password.equals(this.password)) {
            return accountBalance;
        } else {
            System.out.println("not allowed");
            return 0;
        }
        // public double getAccountBalance(){
        //      return accountBalance:
        //      }
    }
    // set or setter keywords is used to change(modify) private information in encapsulated
    public void setAccountBalance(double balance){
        accountBalance=balance;
    }
    void setPassword(String password){
        this.password=password;
    }
}

class BankTester{
    public static void main(String[] args) {
        BankAccount bankAccount= new BankAccount ("User123","password");
        System.out.println(bankAccount.getAccountBalance("password"));
        bankAccount.setAccountBalance(100000);
        System.out.println(bankAccount.getAccountBalance("password"));
    }
}
