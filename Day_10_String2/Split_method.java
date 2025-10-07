package Day_10_String2;

public class Split_method {

    //5. Split string into words.

    public static void main(String[] args) {
        
        String Name = "Nihal More Developer";    

        String[] Name2 = Name.split("");      

        for(String x : Name2){                     
            System.out.println(x);                      
        }
    }
}
