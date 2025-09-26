package Day_8_Arrays;

public class eleMin {
    
    public static void minFind(){
        int [] numbers = {10,20,2,22,56,33,45,36};
        int min = numbers[0];

        for(int i =1; i< numbers.length; i++){
            if(numbers[i] < min){
                min = numbers[i];
            }

        }
        System.out.println("Minimum elements in the array is : " + min);
    }
    public static void main(String[] args) {
        minFind();
    }
}
