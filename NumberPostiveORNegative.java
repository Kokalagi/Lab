package Lab_23_3_23;

import java.util.*;
public class NumberPostiveORNegative 
{
	public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        
        if(num==0)
        {
            System.out.println("The number is Zero");
            
        }
        else if(num>=0)
        {
            System.out.println("The number is Positive");
        }
        else
        {
            System.out.println("The number is negative");
        }
        
    }

}
