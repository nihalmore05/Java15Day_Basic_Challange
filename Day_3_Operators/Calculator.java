package Day_3_Operators;

import java.util.Scanner;

public class Calculator {
     // 10. Make a simple calculator using operators.
     
    public static void main(String[] args) {
        
        System.out.println("------------------/CalCulator/-----------------: ");
        Scanner sc = new Scanner(System.in);
        
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        char opeator = '+';
        double result;

        if(opeator == '+' ){
            result = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + result);
        }else if(opeator == '-' ){
            result = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + result);
        }else if(opeator == '*'){
            result = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + result);
        }else if(opeator == '/'){
            result = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + result);

        }else{
            System.out.println("The default value");
        }
        
        sc.close();
        
    }

}
