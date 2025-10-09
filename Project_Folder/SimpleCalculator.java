package Project_Folder;

import java.util.Scanner;

public class SimpleCalculator {

    // Simple Calculator
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number :");
        double num1 = sc.nextDouble(); // taking double input from user because it can take decimal value also.

        System.out.println("Enter Second Number :");
        double num2 = sc.nextDouble();

        System.out.println("Choose Operation : +, -, *, /");
        char op = sc.next().charAt(0);

        double result = 0;

        if (op == '+') {
            result = num1 + num2;

            System.out.println("Addition of " + num1 + " and " + num2 + " is : " + result);
        } else if (op == '-') {
            result = num1 - num2;

            System.out.println("Subtraction of " + num1 + " and " + num2 + " is : " + result);
        } else if (op == '*') {
            result = num1 * num2;
            System.out.println("Multiplication of " + num1 + " and " + num2 + " is : " + result);
        } else if (op == '/') {
            result = num1 / num2;
            System.out.println("Division of " + num1 + " and " + num2 + " is : " + result);
        } else {
            System.out.println("Invalid Operation");
        }
        sc.close();
    }
}
