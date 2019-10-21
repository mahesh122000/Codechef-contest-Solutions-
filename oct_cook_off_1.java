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
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{a[i]=s.nextInt();b[i]=a[i];}
		Arrays.sort(a);
		int i=0,j=0;
		for(int k=0;k<n;k++)
		{if(b[k]==a[0])
		i=k;
		if(b[k]==a[n-1])
		j=k;}
		if(i<j)
		System.out.println(a[0]+" "+a[n-1]);
		    else
		    System.out.println(a[n-1]+" "+a[0]);
		}
	}
}
