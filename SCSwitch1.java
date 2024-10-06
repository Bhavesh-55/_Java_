import java.util.*;

public class SCSwitch1 
{

public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter Day Number:");
        int day=scan.nextInt();
        
        switch(day)
        {
            case 1: System.out.println("Mon");
                    break;
            case 2: System.out.println("Tue");
                    break;
            case 3: System.out.println("Wed");
                    break;
            case 4: System.out.println("Thur");
                    break;
            case 5: System.out.println("Fri");
                    break;
            case 6: System.out.println("Sat");
                    break;
            case 7: System.out.println("Sun");
                    break;
            default: System.out.println("Invalid");
                    
        } 
        
    }
}



/*

public class SCSwitch1 
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter Domain name");
        String domain=scan.nextLine();
        
        String ext=domain.substring(domain.lastIndexOf(".")+1);
        
        switch(ext)
        {
            case "com": System.out.println("Commercial");
                        break;
            case "org": System.out.println("Organisation");
                        break;
                        
            case "gov": System.out.println("Government");
                        break;
            case "net": System.out.println("Network");
                        break;
        }
        
    }

 */

/*

package scswitch2;

import java.util.*;

public class SCSwitch2 
{
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       
       System.out.println("Menu");
       System.out.println("====");
       System.out.println("ADD");
       System.out.println("SUB");
       System.out.println("MUL");
       System.out.println("DIV");
       
       System.out.println("Enter 2 Numbers");
       int x=sc.nextInt();
       int y=sc.nextInt();
       sc.nextLine();
       System.out.println("Enter Option in Words ");
       String option=sc.nextLine();
       option=option.toUpperCase();
       
       switch(option)
       {
           case "ADD": System.out.println("Sum is "+(x+y));
                        break;
           case "SUB": System.out.println("Difference is "+(x-y));
                        break;
           case "MUL": System.out.println("Product is "+(x*y));
                        break;
           case "DIV": System.out.println("Ratio is "+(x/y));
                        break;
           default:     System.out.println("Invalid Option");
                        break;             
       }
       
    }    
}
*/