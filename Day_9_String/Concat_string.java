package Day_9_String;

public class Concat_string {
    
    //10. Concatenate two strings. 

    String Name1 = "Shraddha";
    String Name2 = "Kapoor";

    String fullnameString = Name1.concat(" " + Name2);    // used concat()  method.

    public static void main(String[] args){   
      Concat_string obj = new Concat_string();        // created object of class ( class name . object name = new class name();
      System.out.println("Full name is : " + obj.fullnameString);   

    }

}
