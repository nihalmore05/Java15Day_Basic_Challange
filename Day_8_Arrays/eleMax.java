package Day_8_Arrays;

public class eleMax {

    public static void findMax(){
        int [] numbers = {10,20,30,40,50,2,22,2500};
        int max = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("Maximum element in the array is : " + max);
    }

    public static void main(String[] args) {
        // eleMax obj = new eleMax();
        // obj.findMax();
        findMax();
    }
}