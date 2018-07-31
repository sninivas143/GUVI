import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Palindrom
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b,sum=0,temp;
		temp=a;
		while(a!=0)
		{
			b=a%10;
			sum=(sum*10)+b;
			a=a/10;
			}
			if (temp==sum)
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
			
	}
}
