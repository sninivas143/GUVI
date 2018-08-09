/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Reversint
{
	public static void main (String[] args) throws java.lang.Exception
	{
				 Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int a,revers=0;
        while(s!=0)
        {
        	a=s%10;
        	revers=(revers*10)+a;
        	s=s/10;
        }
        System.out.println(revers);
	}
}
