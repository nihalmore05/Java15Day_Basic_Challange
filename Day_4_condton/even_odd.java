package Day_4_condton;

import java.util.Scanner;

public class even_odd {

    // 1. Check if a number is even or odd.
public static void main(String[] args) {
    System.out.println("Enter The Number : ");
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();

       if(num / 2 == 0){
        System.out.println("The Number is Even ");
       }else{
        System.out.println("The Number is Odd ");
       }
       sc.close();
}
}
