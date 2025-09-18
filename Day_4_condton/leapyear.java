package Day_4_condton;

import java.util.Scanner;

//5. Check if a year is leap year.

public class leapyear {
    public static void main(String[] args) {
   
        System.out.println("Enter The Year : ");
        Scanner sc = new Scanner(System.in);
        int Year = sc.nextInt();
        boolean isLeap;
        if(Year% 4 == 0){
            isLeap = true;
        }else if(Year % 100 == 0){
            isLeap = false;
        }else if(Year % 400 == 0){
            isLeap = true;
        }else{
            isLeap = false;
        }

        if(isLeap){
            System.out.println(Year + " is The Leapyear");
        }else{
            System.out.println(Year + " is Not Leapyear");
        }
        sc.close();
    }
}
