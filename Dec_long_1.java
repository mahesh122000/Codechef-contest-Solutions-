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
		int a[]=new int[12];
		for(int i=0;i<n;i++)
		{int k=s.nextInt();
		int c=s.nextInt();
		a[k]=Math.max(a[k],c);}
		int sum=0;
		for(int i=1;i<=8;i++)
		sum+=a[i];
		System.out.println(sum);}
	}
}
