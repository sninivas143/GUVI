/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Reversstring
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i=str.length()-1;i>=0;i--)
        {
        	System.out.println(str.charAt(i));
        }
	}
}
