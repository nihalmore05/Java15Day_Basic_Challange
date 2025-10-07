package Day_10_String2;

public class WordString {
    
    // 3. Check if string starts with a word.

    public static void main(String[] args) {
        
        String str = "Hello Nihal More";

        System.out.println(str.startsWith("Hello"));    // used in startsWith() method

        System.out.println(str.startsWith("Nihal"));      // here it will return false because str is not starting with "Nihal"       

    }
}
