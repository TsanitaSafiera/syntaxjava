package Class6;

public class HomeWork1 {
    public static void main(String[] args) {
        int day=7;

        if(day>=1 && day<=5){
            System.out.println("Its a weekdays");
        }else if(day>=6 && day<=7){
            System.out.println("Its a weekend");
        }else{
            System.out.println("Invalid day");
        }
    }
}
