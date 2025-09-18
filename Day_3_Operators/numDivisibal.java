
package Day_3_Operators;

import java.util.*;

// 4. Check if a number is divisible by 5 

public class numDivisibal {

    public static void main(String[] args) {

        System.out.println("Enter the Number :");
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();

        if (i % 5 == 0) {
            System.out.println("The Number is Divisible ");
        } else {
            System.out.println("The Number is not divisible");
        }

        sc.close();

    }
}
