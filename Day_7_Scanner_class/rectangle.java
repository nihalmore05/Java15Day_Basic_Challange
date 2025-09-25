package Day_7_Scanner_class;

import java.util.Scanner;

//8. Take length, width, calculate rectangle area.

public class rectangle {
    
    public static void main(String[] args) {
        System.out.println("------------------------Finding area of Rectangle---------------------------");
        System.out.println("Enter Length : ");
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        System.out.println("Enter Width : ");
        double width = sc.nextDouble();

        double area = length * width;                          // formula used  (Area = Length * width)
        System.out.println("The Area of Rectangle is : "+ area);

        sc.close();



    }
}
