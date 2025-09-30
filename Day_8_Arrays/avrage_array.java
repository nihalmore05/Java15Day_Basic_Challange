package Day_8_Arrays;

// 7. Find sum and print average of array elements

public class avrage_array {
    
    public static void main(String[] args) {
        
        int [] number = {10,50,20,30,40,60,25};

        int sum =0;

        for(int i=0; i<number.length; i++){
            sum= sum + number[i];

        }
        System.out.println("sum of array element : " + sum);  // printing the sum of array elements


        int average = sum/number.length;   // using formula to calculate avg
        System.out.println("avrage of array element : " + average);
        
    }
}
