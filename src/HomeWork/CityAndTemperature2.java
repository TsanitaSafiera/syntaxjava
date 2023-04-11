package HomeWork;

import java.util.Scanner;

public class CityAndTemperature2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please input your city");
        String city=scanner.nextLine();
        System.out.println("The city is "+city);

        Scanner scan=new Scanner(System.in);
        System.out.println("Please input your temperature in fahrenheit");
        double value = scanner.nextDouble();
        double valueFinal = (value - 32) * 5 / 9;
        System.out.print("And the Temperature in "+city+ " is " + valueFinal +" "+ " degrees Celsius " );






    }
}
