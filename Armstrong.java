import java.util.*;
import java.lang.*;
import java.io.*;
class Armstrong
{
	public static void main (String[] args) throws java.lang.Exception
	{
int r,temp,sum=0;
Scanner s=new Scanner(System.in);
int n=s.nextInt();
  temp=n;
while(n>0)
{
r=n%10;
sum=sum+r*r*r;
n=n/10;
}
if(temp==sum)
{
System.out.println("yes");
}
else
System.out.println("no");
}
}
	
