package Day_3_Operators;
import java.util.Scanner;
// 6. Check if a number is between 10 and 50.

public class numbetween {

    public static void main(String[] args){
       System.out.println("------------------: Enter the Number :-----------------------");
        Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();

            if( i>=10  &&  i<=50){
                System.out.println("The Number is between 10 to 50 ");
            }else{
                System.out.println("The Number is Not Between 10  to 50 ");
            }
            sc.close();
        }

    }
    

