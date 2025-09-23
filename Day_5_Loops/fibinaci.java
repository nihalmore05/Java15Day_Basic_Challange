package Day_5_Loops;

public class fibinaci {
    
    // 10. Print Fibonacci series up to 10 terms.

    public static void main(String[] args) {
        
        int a = 0;                                              // the fibpnacci sereies is number  adding last two number like
        int b = 1;                                              // 0+1=1, 1+1=2,  2+3 =5,  5+3=8
        int c;
        System.out.println("fibonacci series is : ");
        for(int i=1; i<10; i++){
            c= a+b;                           // 0+1=1
            System.out.println(""+c);            
            a=b;
            b=c;
        }
    }
}
