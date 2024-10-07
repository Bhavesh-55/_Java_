import java.lang.*;
import java.util.*;

public class SCLoop2 {
        
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Program to Fibonacci Series");
        System.out.println("Enter number of Terms");
        int n=sc.nextInt();
        
        int a=0,b=1,c;
        
        System.out.print(a+","+b+",");
        for(int i=0;i<n-2;i++)
        {
            c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }
        
        
    }
    
    
    
    /*Program for Fibonacci Series
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Program to print GP Series");
        System.out.println("Enter a, r and n");
        int a=sc.nextInt();
        int r=sc.nextInt();
        int n=sc.nextInt();
        
        int term=a;
        
        for(int i=0;i<n;i++)
        {
            System.out.print(term+",");
            term=term*r;
        }
        
      
    } */   
    
    /* Program to Print AP Series
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Program to print AP Series");
        System.out.println("Enter a, d and n");
        int a=sc.nextInt();
        int d=sc.nextInt();
        int n=sc.nextInt();
        
        int term=a;
        for(int i=0;i<n;i++)
        {
            System.out.print(term+",");
            term=term+d;
        }     
   









    /*Display Digits of number
    
    public static void main(String[] args)
    {
       Scanner scan=new Scanner(System.in);

       System.out.println("Enter a Number");
       int n=scan.nextInt();

       int r;
       while(n>0)
       {
        r=n%10;
        n=n/10;

        System.out.println(r);
       }
        System.out.println(n);
    }
*/
    
    
    /* Count Digits Of a Number
    
    public static void main(String[] args)
    {
       Scanner scan=new Scanner(System.in);

       System.out.println("Enter a Number");
       int n=scan.nextInt();

       int count=0;
       while(n>0)
       {
        n=n/10;
        count++;
       }
        System.out.println(count);
    }
    */
    
   
    /* armstrong number
    
    public static void main(String[] args)
    {
       Scanner scan=new Scanner(System.in);

       System.out.println("Enter a Number");
       int n=scan.nextInt();
       
       int m=n;
       int sum=0;
       int r;
       while(n>0)
       {
        r=n%10;
        n=n/10;
        
        sum=sum+r*r*r;
       }
        if(sum==m)
            System.out.println("Its a Armstrong Number");
        else
            System.out.println("Its not an Armsttrong Number");
        
    }
    */

    
}
