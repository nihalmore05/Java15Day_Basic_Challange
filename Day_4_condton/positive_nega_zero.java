package Day_4_condton;

import java.util.Scanner;

//7. Check if number is positive, negative, or zero.

public class positive_nega_zero {
    
    public static void main(String[] args) {
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num >0){
            System.out.println("The Number is Positive ");
        }else if(num < 0){
            System.out.println("The Number is Negative");

        }else if(num == 0){
            System.out.println("The Number is Zero");
        }else{
            System.out.println("Enter Valid Input ");
        }
        sc.close();
    }
}
