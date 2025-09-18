package Day_2;



//.5. Swap values of two integer variables.

public class Swaptwo_integer {
    
    public static void main(String[] args) {
        
        int var1 = 10;

        int var2 = 15;

        var1 = var1 + var2;

        var2 = var1 - var2;

        var1 = var1 - var2;

        System.out.println("Swap value  var1 :"+var1 );
        System.out.println("Swap value  var1 :"+var2 );
          

    }
}
