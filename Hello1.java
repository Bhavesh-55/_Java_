
import java.util.Scanner;

public class Hello1 {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num:");

        int n = sc.nextInt();

        int r =0;
        int m=n;
        int rev=0;

        while (n>0){

            r=n%10;
            rev=rev*10+r;
            n=n/10;
            }
            if (rev==m) {
                System.out.println("palindrome. ");

            } else {
                System.out.println("Not palindrome.");

        }





    }
    
}