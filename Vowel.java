import java.io.*;
import java.util.*;
class Vowel
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    char sc1=sc.next().charAt(0);
    if(sc1=='a'||sc1=='i'||sc1=='o'||sc1=='u'||sc1=='e')
    {
    System.out.println("Vowel");
    }
      else if(sc1=='b'||sc1=='c'||sc1=='d'||sc1=='f'||sc1=='g'||sc1=='h'||sc1=='j'||sc1=='k'||sc1=='l'||sc1=='m'||sc1=='n'||sc1=='p'||sc1=='q'||sc1=='r'||sc1=='s'||sc1=='t'||sc1=='v'||sc1=='w'||sc1=='x'||sc1=='y'||sc1=='z')
      {
        System.out.println("Consonant");
        }
        else
        {
        System.out.println("invalid");
        }
        }
        }
 
    
