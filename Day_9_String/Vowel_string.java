package Day_9_String;

public class Vowel_string {

    // 8. Count vowels in string.
    public static void main(String[] args) {

        String Name = " I am Nihal More and i am Java Developer ";
        int count = 0;

        Name = Name.toLowerCase(); // convert string to lowercase.

        for (int i = 0; i < Name.length(); i++) {

            char ch = Name.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                count++;

            }
        }

        System.out.println("Orignal String is : " + Name);
        System.out.println("Total number of vowels in string is : " + count);

    }
}
