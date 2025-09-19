package Day_5_Loops;

// 3. Find sum of first 10 natural numbers.

public class naturalnum{
    
    public static void main(String[] args){

         int sum = 0;

         for(int i = 1; i<=10; i++ ){
             
            sum = sum + i;
        }
        System.out.println("The Sum of Toatal Natural Numbers is : " +sum);
    }
}
