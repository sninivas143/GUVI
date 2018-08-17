import java.util.*;
import java.lang.*;
import java.io.*;
class Numofwordingivenline
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int c=1;
		for(int i=0;i<str.length();i++)
		{
			if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' '))
			c++;
				
		}
		System.out.println(c);
	}
}
