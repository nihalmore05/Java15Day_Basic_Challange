package Day_9_String;

public class Conten_wordstring {
    
    // 5. Check if string contains word.

    public static void Contains() {              // creating the static fuction or mrthod.

         String Data = " The Double Digit Solution is The Best Company to Develop software in India";
        
         System.out.println(Data.contains("Best"));           // used contains() method.
         System.out.println(Data.contains("Best"));           // used contains() method.

         System.out.println(Data.contains("hello"));        

    }

    public static void main(String[] args){

        Contains();                // called static methiod or function.
    }
}


// out put : true  if  word is present otherwise false.