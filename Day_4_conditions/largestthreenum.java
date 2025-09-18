package Day_4_conditions;
import java.util.Scanner;
public class largestthreenum {
    
    public static void main(String[] args){
        System.out.println("<--------------Enter The First Number----------------->");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("<--------------Enter The Second Number----------------->");
        int num2 = sc.nextInt();
        System.out.println("<--------------Enter The  Third Number----------------->");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("The Largest Number is :--->  " + num1);
        }else if(num2 > num1  && num3 < num2 ){
            System.out.println("The Largest Number is :--->  " + num2);
        }else if(num3 > num2 && num1 < num3){
            System.out.println("The Largest Number is :--->  " + num3);
        }else{
            System.out.println("Invalid Input");
        }
         sc.close();
    }
}
