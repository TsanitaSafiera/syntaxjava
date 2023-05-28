package GroupProjectOOP;

public class Registration {
    // Create Registration Class in which you would have variables as
    //email, userName and password that have an access scope only
    //within its own class. After creating an object of the class user should
    //be able to call methods and in each method separately pass values
    //to set users email, username and password.
    //Requirements:
    //A. Valid email consider to be only yahoo
    //B. Valid userName and password cannot be empty and should be of
    //length larger than 6 characters. Also valid password cannot contain
    //userName.

    private String email;
    private String userName;
    private String password;

    public Registration(String email, String userName, String password) {
        this.email = email;
        this.userName = userName;
        this.password = password;
    }

    String getEmail() {
        if (email.contains("Yahoo")) {
            System.out.println(email);
            return (email);
        } else {
            System.out.println("You've entered a wrong email address");
            return email;
        }

    }

    public String getUserName(String userName) {
        if (!userName.isEmpty() && userName.length() > 6) {
            System.out.println(userName);
            return userName;
        } else {
            System.out.println("not allowed");
            return userName;
        }
    }

    public String getPassword(String password) {
        if (password.contains(userName)) {
            System.out.println("password contain username");
            return password;
        } else {
            System.out.println("password allowed");
            return password;
        }
    }

    public void setEmail(String email) {
        this.email = email;

    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

class RegistrationTester{
    public static void main(String[] args) {
        Registration registration=new Registration("Joan@Yahoo.com","JoanWhite","pass123");
        registration.getEmail();
        registration.setEmail("JoanWhite@Yahoo.com");
        System.out.println(registration.getEmail());

        registration.getUserName("JoanWhite");
        registration.setUserName("JoanWhite1");
        System.out.println(registration.getUserName("JoanWhite1"));

        registration.getPassword("user123");
        registration.setPassword("pass123");
        System.out.println(registration.getPassword("pass123"));

    }
}
