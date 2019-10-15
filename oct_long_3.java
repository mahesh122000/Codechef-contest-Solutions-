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
		long a[]=new long[n];
		long k=s.nextLong();
		for(int i=0;i<n;i++)
		{a[i]=s.nextLong();}
		long kk=k%(3*n);
		{for(int j=0;j<kk;j++)
		a[j%n]=a[j%n]^a[n-j%n-1];}
		if(n%2==1 && k>n/2)
		a[n/2]=0;
		for(int j=0;j<n;j++)
		System.out.print(a[j]+" ");
		System.out.println();}
	}
}
