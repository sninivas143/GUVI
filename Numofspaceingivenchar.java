/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Numofspaceingivenchar
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner in=new Scanner(System.in);
	String s=in.nextLine();
	String str[]=s.split(" ");
	int l=str.length;
System.out.println(l-1);
	}
}
