package Day_7_Scanner_class;
import java.util.Scanner;
public class nameprint {

    public static void main(String[] args) {

        nameprinting();
        
    }

    
public static void nameprinting(){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter The Name");
    
    String name = sc.nextLine();

    System.out.println("You are Name is: " + name);

    sc.close();
}
}