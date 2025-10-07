package Day_10_String2;

public class Count_word {
    // 9. Count words in string.
    public static void main(String[] args) {
        
        String word = "Hello Nihal welcome to java";            // space count kar ne se hum word count kar sakte hai here 4 space mins 5 words

        int count = 0;   //

        for(int i=0; i<word.length(); i++){
            if(word.charAt(i) == ' '){
                count++;
            }
        }
          System.out.println("Total number of worlds = " + (count +1));  // adding 1 to count as number of words is always one more than number of spaces);
    }
}
