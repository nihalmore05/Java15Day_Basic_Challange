package Day_9_String;

public class Palindrom_string {

    // 7. Check if string is palindrome.
public static void main(String[] args) {
    
    String Name = "ABA";
    String rev = "";

    for(int i = Name.length()-1; i>=0; i--){      // used for loop to reverse string.
        rev = rev + Name.charAt(i);              // used charAt() method to get character at specific index.
    }

    if(Name.equals(rev)){                        // used equals() method to compare two strings.  
        System.out.println(Name +" <-----  String is Palindrome");
    }else{
        System.out.println("String is not Palindrome");
    }
    
    
    
    
}
    
    
}
