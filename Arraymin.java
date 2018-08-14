import java.util.*;
import java.lang.*;
import java.io.*;
class Arraymin
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int small, size, i;
       int arr[] = new int[50];
       Scanner scan = new Scanner(System.in);
       size = scan.nextInt();
	          for(i=0; i<size; i++)
       {
           arr[i] = scan.nextInt();
       }
	         small = arr[0];
	   
       for(i=0; i<size; i++)
       {
           if(small > arr[i])
           {
               small = arr[i];
           }
            }
	          System.out.print(small);
	}
}
