package Day_1;
// 10. Swap two numbers without using a third variable

public class Swap2Num {
    
    public static void main(String[] args) {
        
        int a = 9;

        int b = 40; 

        System.out.println("before swap a = " +a + ", b = "+b);
         
        a = a+b;      // a = 9+40 = 49    a=49
        b = a-b;     //  b = 49-40 = 9    b=9
        a = a- b;    //  a = 49-9 =40     a=40 
        System.out.println("After swap a = " +a + ",b = "+ b);
        

    
    }
}
