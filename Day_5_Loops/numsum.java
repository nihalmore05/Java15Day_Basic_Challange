package Day_5_Loops;

public class numsum {
    
    //7. Find sum of digits of a number.

    public static void main(String[] args) {
        
        int num = 426610;             
        int sum = 0;                              // sum zero becous of sum statring 0 

                                            
        while(num > 0){                             // whe num not is equal to zero and less tham zero loop contenuesly working
            int digit = num % 10;                  // mode (%)  opoerator used to got thr remainder 

            sum = sum + digit;

            num = num / 10;
        }

        System.out.println("the sum of digits = " + sum );

    }
}
