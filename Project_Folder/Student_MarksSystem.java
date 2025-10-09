package Project_Folder;

import java.util.Scanner;

public class Student_MarksSystem {

    // Make Student Marks System (store marks, percentage, find average, grade).

    public static void main(String[] args) {

        System.out.println("Enter Student Name : ");

        Scanner Marks = new Scanner(System.in);

        String Studentname = Marks.nextLine(); // Taking input student name

        // input subject marks
        System.out.println("Enter 5 Subject Marks : ");
        System.out.print("Subject 1: ");
        double s1 = Marks.nextDouble();
        System.out.print("Subject 2: ");
        double s2 = Marks.nextDouble();
        System.out.print("Subject 3: ");
        double s3 = Marks.nextDouble();
        System.out.print("Subject 4: ");
        double s4 = Marks.nextDouble();
        System.out.print("Subject 5: ");
        double s5 = Marks.nextDouble();

        // Checking each subject Marks bellow 35 then fail
        if (s1 < 35 || s2 < 35 || s3 < 35 || s4 < 35 || s5 < 35) {
            System.out.println("\nResult: Fail because of You are Fail (One or more Subjects  Makrs below in 35) ");
        } else {

            double TotalMarks = s1 + s2 + s3 + s4 + s5;

            double Percentage = (TotalMarks / 500) * 100;       // percentage formula

            double average = TotalMarks / 5;

            // Checking percentage to got the grade
            String Grade;                             

            if (Percentage >= 95) {
                Grade = "A+";
            } else if (Percentage >= 90) {
                Grade = "A";
            } else if (Percentage >= 80) {
                Grade = "B";
            } else if (Percentage >= 60) {
                Grade = "C";
            } else if (Percentage >= 50) {
                Grade = "D";
            } else if (Percentage >= 35) {
                Grade = "PASS";
            } else {
                Grade = "FAIL";
            }

            // Final Output Printing (Result)
            System.out.println("---------------------------------------------------------");
            System.out.println("-----------------*Final Result*--------------------------");
            System.out.println("---------------------------------------------------------");
            System.out.println("NAME OF STUDENT :" + Studentname);
            System.out.println("TOTAL MARKS     :" + TotalMarks);
            System.out.println("PERCENTAGE      :" + Percentage + " %");
            System.out.println("THE AVERAGE     :" + average);
            System.out.println("THE GRADE       :" + Grade);

        }
        Marks.close();
    }
}
