package Day_5_Loops;

public class factor {

    // 5. Calculate factorial of 5

    public static void main(String[] args) {

        int number = 3;
        int result = 1;

        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        /*
        factorial 
         * 1 × 2 = 2
         * 
         * 2 × 3 = 6
         * 
         * 6 × 4 = 24
         * 
         * 24 × 5 = 120
         * 
         *  5 = 120 
         */
        System.out.println(number + " factorial is " + result);

    }
}
