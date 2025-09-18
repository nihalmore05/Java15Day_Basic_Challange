package Day_3_Operators;

import java.util.Scanner;

// 8. Use || operator for two conditions                       // This is the OR operator   ( at is one condition true)

public class OR_operator {

    public static void main(String[] args) {

        System.out.println("Enter The Marks : ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Enter The Percentage : ");

        Double num2 = sc.nextDouble();

        if (num > 35 || num2 >= 40) {
            System.out.println("You are Pass ");
        } else {
            System.out.println("You are Fail");
        }
        sc.close();
    }
}
