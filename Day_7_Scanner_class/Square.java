package Day_7_Scanner_class;

import java.util.Scanner;

public class Square {
// 9. Take number and print its square.

    public static void main(String[] args) {
        System.out.println("Enter The Number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int Square = number * number;          // formula ued

        System.out.println("The Square is : " + Square);

        sc.close();
    }
}
