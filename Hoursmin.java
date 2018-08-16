import java.util.*;
import java.lang.*;
import java.io.*;
class Hoursmin
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int res=n/60;
		int res1=n%60;
		System.out.print(res+" "+res1);
		}
}

