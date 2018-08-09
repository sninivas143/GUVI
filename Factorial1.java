/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Factorial1
{
	public static void main (String[] args) throws java.lang.Exception
	{
	       int 	fact=1;
		 Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        for(int i=1;i<=s;i++)
        {
        	fact=fact*i;
        	
        }
        	System.out.println(fact);
        
	}
}
