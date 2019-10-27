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
		for(int i=0;i<n;i++)
		a[i]=s.nextInt();
		Arrays.sort(a);
		int k=n/4;
		if(a[k-1]!=a[k] && a[2*k-1]!=a[2*k] && a[3*k-1]!=a[3*k])
		{if(n!=4)
		{System.out.println(a[k]+" "+a[2*k]+" "+a[3*k]);}
		else
		    System.out.println(a[2*k-1]+" "+a[3*k-1]+" "+a[4*k-1]);}
		    else
		    System.out.println("-1");
		}
	}
}
