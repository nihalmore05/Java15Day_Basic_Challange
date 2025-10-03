package Day_9_String;

public class Sub_string {

    // 4. Extract substring from string.
    
    String Name = "I LOVE MY WORK";
    
    String substring = Name.substring(0, 6);   // here used substring() method.
    

    //String substring = Name.substring(05);                // here used substring() method.
    public static void main(String[] args) {

        Sub_string obj = new Sub_string();                                // created object of class.
        System.out.println("Substring is : " + obj.substring);
    }

}
