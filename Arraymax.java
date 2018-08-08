
import java.util.*;
import java.lang.*;
import java.io.*;
class Arraymax
{
	public static void main (String[] args) throws java.lang.Exception
	{
	        int n, max;

        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int a[] = new int[n];

        for(int i = 0; i < n; i++)

        {

            a[i] = s.nextInt();

        }

        max = a[0];

        for(int i = 0; i < n; i++)

        {

            if(max < a[i])

            {

                max = a[i];

            }

        }

        System.out.println(max);
	}
}
