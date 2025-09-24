import java.util.Scanner;

//3. Check if a number is prime.

public class prime_nuber {
public static void main(String[] args) {
    System.out.println("Enter The Number : ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int temp= 0;

    for(int i=2; i<=num-1; i++){                 

    if(num % i == 0){

     temp = temp+1;

    }
}if(temp==0){

    System.out.println(num + " number is prime number");
}else{
    System.out.println(num + " number is not prime number");
}

    sc.close();

}    
}
