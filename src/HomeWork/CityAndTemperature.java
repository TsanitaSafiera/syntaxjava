package HomeWork;

import java.util.Scanner;

public class CityAndTemperature {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please input your city");
        String city=scanner.nextLine();
        System.out.println("The city is "+city);

        Scanner scan=new Scanner(System.in);
        System.out.println("Please input your temperature");
        System.out.println("Fahrenheit to Celsius (1) or Celsius to Fahrenheit (2)");
        int result= scanner.nextInt();

        if(result==1) {
            System.out.println("You have chosen Fahrenheit to Celsius");
            System.out.println("Enter fahrenheit value");
            double value = scanner.nextDouble();
            double valueFinal = (value - 32) * 5 / 9;
            System.out.print("Celsius is: ");
            System.out.println(Math.round(valueFinal * 10.0 / 10.0));

        }else if(result==2){
            System.out.println("You have chosen celsius to fahrenheit");
            System.out.println("Enter a Celsius value");
            double value2= scanner.nextDouble();
            double finalResult=value2 * 1.8 + 32;
            System.out.print("Fahrenheit is: ");
            System.out.println(Math.round(finalResult*10.0/10.0));

        }else{
            System.out.println("not a valid choice");
        }



    }
}
