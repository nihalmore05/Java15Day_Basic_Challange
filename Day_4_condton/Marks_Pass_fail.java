package Day_4_condton;

import java.util.Scanner;

//6. Check if marks >= 40 → Pass else Fail.

public class Marks_Pass_fail {
    public static void main(String[] args) {
        
    System.out.println("Enter The Marks : ");
    Scanner sc = new Scanner(System.in);
    int Marks = sc.nextInt();

    if(Marks >=40){
        System.out.println("You are Pass ");
    }else{
        System.out.println("You are Fail");
    }
    sc.close();
    }
}
