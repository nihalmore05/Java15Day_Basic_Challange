package Day_4_condton;

import java.util.Scanner;

// 3. Find largest of two numbers.

public class largetwonum {
    
    public static void main(String[] args){
        System.out.println("Enter The First Numbers "); 
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter The Second Numbers "); 
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println("The " + num1 + " is Largest");

        }else if(num1 < num2){
            System.out.println("The " + num2 + " is Largest ");
        }else{
            System.out.println("Invalid Input");
        }

    sc.close();
    
        
    }
}
