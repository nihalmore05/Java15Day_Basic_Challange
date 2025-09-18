package Day_3_Operators;

import java.util.Scanner;

// 3. Check if a number is greater than 100.

public class greaternum {
    public static void main(String[] args) {
        System.out.println("Enter The Number : ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        if (i > 100) {
            System.out.println("The Number is Greater Than 100 : ");
        } else {
            System.out.println("The Number is Lees Than 100 : ");
        }

        sc.close();
    }

}
