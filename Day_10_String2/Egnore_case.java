package Day_10_String2;

public class Egnore_case {

    // 2. Compare strings ignoring case.

    public static void main(String[] args) {

        /*
         * String Name1 = "NEhal";
         * String Name2 = "nehaL";
         * 
         * System.out.println(Name1.equalsIgnoreCase(Name2));
         * 
         * }
         */
        // Real life example of ignore case

        String inputUser = "ADmin";
        String storeUsed = "Admin";

        System.out.println(inputUser.equalsIgnoreCase(storeUsed)); // used in equalsIgnoreCase() method

    }
}
