package Day_10_String2;

public class endwith_method {
    

    public static void main(String[] args) {
        
        String Name = "Double Digit Solutions";

        System.out.println(Name.endsWith("ns"));            // used in endsWith() method

        System.out.println(Name.endsWith("Double"));     // here it will return false because str is not ending with "Double"
    }   
}
