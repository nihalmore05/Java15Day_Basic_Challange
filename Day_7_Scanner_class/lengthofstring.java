package Day_7_Scanner_class;

import java.util.Scanner;

//10. Take string input and print length.

public class lengthofstring {
    
    public static void main(String[] args) {
        System.out.println("Enter name : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();                          // taking user string input

        int length = str.length();                      // string par  .length()   ye wali method call ki gayi hai

        System.out.println("The Length of string is : "+ length);

        sc.close();


    }
}
