package Day_7_Scanner_class;

import java.util.Scanner;

//4. Take marks of 3 subjects and print average.

public class Marks_avg {
    
    public static void main(String[] args) {
        
        System.out.println("Enter The 3 Subject Marks : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Subject 1");
        int sub1 = sc.nextInt();
        System.out.println("Subject 2");
        int sub2 = sc.nextInt();
        System.out.println("Subject 3");
        int sub3 = sc.nextInt();

        int sum = sub1 + sub2 + sub3;
        int avg = sum/3;

        System.out.println("The average is :" + avg);

        sc.close();
    }
}
