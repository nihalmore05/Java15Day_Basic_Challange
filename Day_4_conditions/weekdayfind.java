package Day_4_conditions;

public class weekdayfind {
    //11. Check day of week number (1–7).

    public static void main(String[] args) {
        
        String Day = "Friday";

        if(Day == "Monday"){
              System.out.println("Day Number: 1");
        }else if(Day == "Tuesday"){
            System.out.println("Day Number: 2");
        }else if(Day == "Wednesday"){
            System.out.println("Day Number: 3");
        }else if(Day == "Thursday"){
            System.out.println("Day Number: 4");
        }else if(Day == "Friday"){
            System.out.println("Day Number: 5");
        }else if(Day == "Saturday"){
            System.out.println("Day Number: 6");
        }else if(Day == "Sunday"){
            System.out.println("Day number: 7");
        }else{
            System.out.println("Enter valid data");
        }
    }
}
