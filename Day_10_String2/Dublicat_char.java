package Day_10_String2;

public class Dublicat_char {
    
    //10. Find duplicate characters in string.
public static void main(String[] args) {
    

    String name = "Nihalalh";

    for(int i=0; i<name.length(); i++){
        for(int j=i+1; j<name.length(); j++){

            if(name.charAt(i) == name.charAt(j)){
                
                System.out.println(name.charAt(i));
            }
        }
    }
}
}