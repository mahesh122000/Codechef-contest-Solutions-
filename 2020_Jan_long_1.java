/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{int n=s.nextInt();
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int count=0;
		if(a+b+c<=n)
		System.out.println("1");
		else if((a+b<=n && a+b+c>=n)||(b+c<=n && a+b+c>=n))
		System.out.println("2");
		else
		System.out.println("3");}
	}
}
