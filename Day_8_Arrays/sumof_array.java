package Day_8_Arrays;

public class sumof_array {

    // 2. Find sum of array elements.

    public static void main(String[] args) {
        
        int [] numbers ={10,20,30,40,50};
        int sum = 0;
        
        for(int i =0; i < numbers.length; i++){
            sum = sum + numbers[i];
        }

        System.out.println("Sum of array elements is :" + sum);
    }
}
