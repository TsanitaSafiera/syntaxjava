package class16;

public class Cat {
    private String name;
    private String breed;
    private String color;

    public void printInfo(String password){
        if(password.equals("pass 123")){
            System.out.println(name);
        }else{
            System.out.println("You need to provide the right password");
        }

    }
}
