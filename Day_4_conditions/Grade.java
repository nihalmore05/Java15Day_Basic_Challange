package Day_4_conditions;

import java.util.Scanner;

// 8. Assign grade (A, B, C) based on marks.

public class Grade {
    public static void main(String[] args) {
        System.out.println("Enter The marks :");
    Scanner sc = new Scanner(System.in);
    int Marks = sc.nextInt();    
      
    if(Marks >= 90){
     System.out.println("The Grade is :   A ");
    }else if(Marks >= 80){
        System.out.println("The Grade is :  B");

    }else if(Marks >= 60){
        System.out.println("The Grade is : C");
    }else{
        System.out.println("You are Pass ");
    }
    sc.close();
    }
}
