package Day_7_Scanner_class;

import java.util.Scanner;

public class areatoradius {

    // 3. Take radius input and print circle area.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius value : ");   
        double radius = sc.nextDouble();                           // we can taking a input usear side

        double area = Math.PI * radius * radius;               // The formula we can use find the area of circle

        System.out.println("The area of Circle is : " + area);
        sc.close();
    }

}
