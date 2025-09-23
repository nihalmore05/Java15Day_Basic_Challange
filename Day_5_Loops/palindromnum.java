package Day_5_Loops;

public class palindromnum {
    
    public static void main(String[] args) {
        
        int number = 122;
        int original = number;
        int temp = 0;
    

        while(number != 0){
            int digit = number % 10;
            temp = (temp * 10) + digit;
            number = number / 10;       
         }

        

    if(original ==  temp){
        System.out.println(original + "------> is a palindrome number");
    }else{
        System.out.println(original + "   is the not palindrome number");
    }
}
}