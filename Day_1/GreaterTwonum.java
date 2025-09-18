package Day_1;
//6. Find the greater of two numbers


public class GreaterTwonum {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        // solving using if else method


        //  if(a>b){
        //     System.out.println("The A is Greater ");
        //  }else if (a<b){
        //     System.out.println("The B is Greater ");
        //  }else{
        //     System.out.println("The both values are Equal");
        //  }
             

        // Type Two To Solve This using  "Math.max"

        
         int greater = Math.max(a, b);
         System.out.println("The Greater Number is :" +greater);
    }
}
