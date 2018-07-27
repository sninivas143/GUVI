import java.util.Scanner;
class Integer
{
	public static void main(String args[])
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		System.out.println(count);
	}
}
