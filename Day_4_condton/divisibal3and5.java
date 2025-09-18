package Day_4_condton;

import java.util.Scanner;

// 10. Check if number divisible by both 3 and 5.

public class divisibal3and5 {
    public static void main(String[] args) {
        System.out.println("Enter the Number ");
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();

         if(num % 5 == 0 && num % 3 == 0){
            System.out.println("The Number is divisibal");
         }else{
            System.out.println("The Number is Not divisibal");
         }
         sc.close();
    }
}
