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
		int m=s.nextInt();
		long countxo=0,countxe=0,countyo=0,countye=0;
		long b[]=new long[n];
		long c[]=new long[m];
		int q=s.nextInt();
		while(q-->0)
		{int r=s.nextInt();
		int cl=s.nextInt();
		b[r-1]++;
		c[cl-1]++;}
		for(int i=0;i<n;i++)
		{if(b[i]%2==0)
		{countxe++;}
		else
		{countxo++;}}
		for(int j=0;j<m;j++)
		{if(c[j]%2==0)
		{countye++;}
		else
		{countyo++;}}
		long ans=countxe*countyo;
		ans+=countxo*countye;
		System.out.println(ans);}
	}
}
