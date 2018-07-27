import java.io.*;
import java.util.*;
class Leapyear
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int year=sc.nextInt();
            boolean flag = false;

        if(year % 400 == 0)

        {

            flag = true;

        }

        else if (year % 100 == 0)

        {

            flag = false;

        }

        else if(year % 4 == 0)

        {

            flag = true;

        }

        else

        {

            flag = false;

        }

        if(flag)

        {

            System.out.println("Year "+year+" is a Leap Year");

        }

        else

        {

            System.out.println("Year "+year+" is not a Leap Year");

        }
  }
}
