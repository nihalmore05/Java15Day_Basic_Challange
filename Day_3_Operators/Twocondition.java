package Day_3_Operators;
// 7. Use && operator for two conditions.

//--------------Logical  "AND" Operator-----------------------

public class Twocondition {

    public static void main(String[] args) {
        
        int age = 18;
        boolean votingcard = true;

        if(age >=18  && votingcard == true){
            System.out.println("You can a vote");

        }else{
            System.out.println("You are not eledgebal for Vote : ");
        }
    }
    
}
