package Day_7_Scanner_class;

import java.util.Scanner;

//6. Take temperature in Celsius and convert to Fahrenheit

public class Temperature {

    public static void main(String[] args) {
        System.out.println("Enter The Celsius : ");
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
        
        double fahrenheit = (celsius*9/5)+32;

        System.out.println("The Fahreneheit : " + fahrenheit);

        sc.close();
    }
}