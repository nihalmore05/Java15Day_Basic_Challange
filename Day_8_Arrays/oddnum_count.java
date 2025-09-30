package Day_8_Arrays;

//9. Count odd numbers in array.

public class oddnum_count {
    
    public static void main(String[] args) {
        
        int number [] = {12,4,55,52,12,16,22,25};

        int count = 0;

        for(int i=0; i<number.length; i++){
            if(number[i]%2 !=0){
                count++;
                System.out.println(number[i] + " <---  Thid is a odd number");
            }
        }
        System.out.println("The total odd number in array : " + count);
    }
}
