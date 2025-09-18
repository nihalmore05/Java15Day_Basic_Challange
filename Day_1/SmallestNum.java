package Day_1;

//7. Find the smallest of three numbers.

public class SmallestNum {

    public static void main(String[] args) {

        int num1 = 20, num2 = 500, num3 = 10;

        if (num1 < num2 && num1 < num3) {
            System.out.println("Smallest number is :" + num1);
        } else if (num2 < num1 && num2 < num3) {

            System.out.println("Smallest number is :" + num2);
        } else if (num3 < num1 && num2 > 3) {
            System.out.println("Smallest number is :" + num3);
        } else {
            System.out.println("invalid value");
        }

    }

}
