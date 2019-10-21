/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static boolean ans(long n)
    {
        int count=0;
        while(n%10==0)
        {count++;
        n=n/10;}
        int c=0;
        while(n%2==0)
        {c++;
        n=n/2;}
        if(n!=1)
        return false;
        else
        {if(c>count)
        return false;
        else
        return true;}
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{long n=s.nextLong();
		if(ans(n))
		System.out.println("Yes");
		else
		    System.out.println("No");
		}
	}
}
