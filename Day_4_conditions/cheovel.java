package Day_4_conditions;

import java.util.Scanner;

// 9. Check if given char is vowel or consonant.

// The Vowel is --->   A, E, I, O, U

// consonant ---> B, C, D, F, G, H, J, K, L, M, N, P, Q, R, S, T, V, W, X, Y, Z।

public class cheovel {
public static void main(String[] args) {
    
    char ch;

    System.out.println("Enter Charector : ");
    Scanner sc = new Scanner(System.in);
    ch = sc.next().charAt(0);

    if(ch=='a' || ch=='e' || ch=='i' || ch=='o'  ||  ch=='u'){
      System.out.println("The char " + ch  +  "  is Vowel");
    }else{
        System.out.println("The char is consonant");
    }
    sc.close();
}    
}
