package Day_8_Arrays;

public class simple_array {
    
    public static void main(String[] args) {
        // using for loop
        System.out.println("using for loop");

        int[] numbers ={10,20,30,40,50};           // declaring and initiallizing an array



        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        // using for-each loop
        System.out.println("using for-each loop");
        for(int num : numbers){
            System.out.println(num);
        }
    }
}
