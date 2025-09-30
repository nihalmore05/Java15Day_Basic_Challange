package Day_8_Arrays;


// 8. Count even numbers in array.

public class evennum_count {
    

    
    public static void main(String[] args) {
        
        int [] number ={ 12, 15, 2, 4, 6};

        int count = 0;    

        for(int i=0; i<number.length; i++){
            if(number[i]%2 == 0){
                count++;   
                System.out.println(number[i] +  " ");
            }
        }
        System.out.println("Total Even number in array : " + count);
    }
}
