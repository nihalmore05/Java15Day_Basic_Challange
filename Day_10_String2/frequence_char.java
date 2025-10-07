package Day_10_String2;

public class frequence_char{

    // 8. Find frequency of a character in string.

    public static void main(String[] args){

        String word = "Hello Nihal Sir Welcome to java Programing";
        char ch = 'a'; // character whose frequency we want to find
        int count = 0;

        for (int i = 0; i<word.length(); i++){
            if(word.charAt(i) == ch){               // charAt() method to get character at specific index
                count++;
            }
        }
        System.out.println("Frequency of '" + ch + "' = " + count);
    }
}