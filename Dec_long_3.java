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
		String c=s.next();
		int a[]=new int[26];
		for(int i=0;i<26;i++)
		a[i]=-1;
		int max=0;
		int min=n;
		int l=0,r=0;
		for(int i=0;i<n;i++)
		{int k=(int)(c.charAt(i)-'a');
		if(a[k]==-1)
		{a[k]=i;}
		else
		{
		int q=i-a[k];
		if(q<min)
		min=q;
		a[k]=i;
		}}
		System.out.println(n-min);}
	}
}
