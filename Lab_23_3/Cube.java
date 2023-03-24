package Lab_23_3_23;

import java.util.*;
public class Cube
{
	public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        
        for(int i=1; i<=num;  i++)
        {
            int cubes=i*i*i;
            
            System.out.println(cubes);
        }
        
    }

}
