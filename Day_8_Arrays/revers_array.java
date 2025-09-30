package Day_8_Arrays;

//5. Print array in reverse order.

public class revers_array {
    public static void main(String[] args) {

        int[] numbers = { 10, 20, 30, 40, 50 };
        int n = numbers.length;

        // this loop for using normal array printing

        System.out.print("The Normal array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }

        // this loop for using reverse array
        System.out.print("\nRevers array is :");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");

        }
    }
}
