package Day_2;

// 8. Store marks of 3 subjects and print average.

public class Marks_store {
    public static void main(String[] args) {
        
        int English = 95;
        int Python = 88;
        int CloudComputing = 90;
        
        int sum = English + Python + CloudComputing;        // The sum of total numbers
        int Avg = sum / 3;                                  // The Average of subjects
        System.out.println("The Average Of Subject is : " + Avg);  // printing the out put
    }
}
