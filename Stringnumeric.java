import java.util.*;
import java.lang.*;
import java.io.*;
class Stringnumeric
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
        boolean numeric = true;
        try {
            Double num = Double.parseDouble(s);
        } 
        catch (Exception e) 
        {
            numeric = false;
        }
        if(numeric)
            System.out.println( " Yes");
        else
            System.out.println( "No");
            }
}
