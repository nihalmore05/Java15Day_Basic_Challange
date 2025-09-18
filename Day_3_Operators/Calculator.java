package Day_3_Operators;

public class Calculator {
     // 10. Make a simple calculator using operators.
     
    public static void main(String[] args) {
        
        System.out.println("------------------/CalCulator/-----------------: ");
        double num1 = 10;
        double num2 = 12;
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
        
        
    }

}
