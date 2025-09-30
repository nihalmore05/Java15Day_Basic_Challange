package Day_8_Arrays;

public class secondlarg_numarray {

    // 10. Find second largest number in array.
    public static void main(String[] args) {

        int[] number = { 14, 11, 25, 36, 18, 55, 36, 4, 22, 54 };

        int largest = Integer.MIN_VALUE;       
        int second = Integer.MIN_VALUE;     

        for (int i = 0; i < number.length; i++) {
            int num = number[i];


            if (num > largest) {   
                second = largest;
                largest = num;
            } else if (num > second && num != largest) {    
                second = num;
            }
        }

            if (second == Integer.MIN_VALUE) {                         //
                System.out.println("The No Largest number in array");
            } else {
                System.out.println("The second largest number is : " + second);
            }
        }
    }

