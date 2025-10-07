package Day_10_String2;

public class Remove_Space {
    
    // 7. Remove spaces from string.
    
    public static void main(String[] args) {
        
        String word = "    Hello Nihal sir       ";

        System.out.println(word.replaceAll(" ", "")); // used in replaceAll() method to remove all spaces
    }
}
