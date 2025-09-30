package Day_8_Arrays;

import java.util.Scanner;

public class Search_element {

//  6. Search element in array.

    public static void main(String[] args) {
        
        int [] number = {10,50,20,30,40,60,70};
        
        System.out.println("Enter the Searching element : ");
        Scanner sc = new Scanner(System.in);
        int  searchnumber = sc.nextInt();

        boolean found = false;         // using flag variable to check element is found or not
        
        for(int i=0; i<number.length; i++){
            if(number[i] == searchnumber){
                found = true;
                break;
            }
        }

        

        if(found){
            System.out.println(searchnumber + " <----- Element found in array ");
        }else{
            System.out.println(searchnumber + " <----- Element not found in array");
        }
        
           sc.close(); 
        }

    

        
}

