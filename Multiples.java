/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Multiples
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int n;
		for(int i=1;i<=5;++i)
		{
			n=s*i;
			System.out.println(n);
		}
		
		
	}
}
