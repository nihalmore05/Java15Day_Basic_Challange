package Day_5_Loops;

public class even_num {
    // 2. Print even numbers 1 to 20.

    public static void main(String[] args) {

        System.out.println("The Even  number is : ");

        for (int i = 1; i < 21; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
