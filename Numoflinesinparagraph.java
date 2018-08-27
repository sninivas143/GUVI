import java.util.*;
import java.lang.*;
import java.io.*;
class Numoflinesinaparagraph
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s1;
		char ch;
		int i,count =1;
		Scanner sc=new Scanner(System.in);
		s1=sc.nextLine();
		for(i=0;i<s1.length();i++)
		{
			ch=s1.charAt(i);
			if(ch=='.')
			{
				count++;
			}
		}
System.out.println(count);
	}
}
