package Day_7_Scanner_class;

import java.util.Scanner;

//1. Take 2 numbers input and add.

public class add2num {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number :");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum of two number is : "+ sum);
        
        
        sc.close();

    }
}
