package Day_7_Scanner_class;

import java.util.Scanner;

public class eligibiletyvote {

    // 7. Take age input and check eligibility to vote

    public static void main(String[] args) {
        System.out.println("Enter You are Age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age > 18) {

            System.out.println("You can a vote ");

        } else {
            System.out.println("You are not eligigible for vote");
        }

        sc.close();
    }
}
