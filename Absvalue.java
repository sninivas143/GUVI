import java.util.*;
import java.lang.*;
import java.io.*;
class Absvalue
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int hr,min;
		Scanner sc=new Scanner(System.in);
		int hr1=sc.nextInt();
		int hr2=sc.nextInt();
		int min1=sc.nextInt();
		int min2=sc.nextInt();
		hr=Math.abs(hr1-min1);
		min=Math.abs(hr2-min2);
		System.out.println(hr+" "+min);
	}
}
