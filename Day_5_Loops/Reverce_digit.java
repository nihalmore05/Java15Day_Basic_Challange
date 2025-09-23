package Day_5_Loops;

public class Reverce_digit {
    
    //6. Reverse digits of a number.

    public static void main(String[] args){
      

        int number = 1234;

        int reversedNumber = 0;

        System.out.println("Orignal number: " + number);

        while( number !=0){

            int lastDigit = number % 10;
        
        
        reversedNumber = reversedNumber * 10 + lastDigit;

        number = number / 10;
    
    }
        System.out.println("Reversed number: " + reversedNumber);

    }
}
