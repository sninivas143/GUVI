import java.util.*;
import java.lang.*;
import java.io.*;
class Arithamatic
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a=sc.nextInt();
	int d=sc.nextInt();
	int sum=0;
	for( int i=a;n!=0;i=i+d)
	{
		sum=sum+i;
		n=n-1;
		}
	System.out.println(sum);
	}
}
