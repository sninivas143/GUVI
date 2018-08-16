import java.util.*;
import java.lang.*;
import java.io.*;
class Arrayindex
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            System.out.println(a[i]+" "+i);
	}
}
}
