package Day_7_Scanner_class;

import java.util.Scanner;

//5. Take number and check even/odd.

public class even_odd_checker {

    public static void main(String[] args) {
         
        evenoddchecker();                           // The function is calling in main
    }
 
    public static void evenoddchecker(){                 // the function is created

        System.out.println("Enter the number you want to check : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        if(number % 2 ==0){
            System.out.println("The Number is Even");
        }else{
            System.out.println("The Number is Odd");
        }
        sc.close();
    }
}
