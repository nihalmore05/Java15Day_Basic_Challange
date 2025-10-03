package Day_9_String;

public class Reverse_string {

    // 5. Reverse a string.

    public static void main(String[] args) {

        String Name = "I Love my india";

        String reversed = ""; // created empty string to store reversed string.

        for (int i = Name.length() - 1; i >= 0; i--) {         // used for loop to reverse string.
            reversed = reversed + Name.charAt(i);              // used charAt() method to get character at specific index.
            // System.out.print(Name.charAt(i));
        }
        System.out.println("Original string is :--->  " + Name);       

        System.out.println("Reversed string is :--->  " + reversed);           

    }
}