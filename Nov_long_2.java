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
		int b[][]=new int[129][3];
	//	ArrayList<Integer>al=new ArrayList<Integer>();
		a[0]=0;
		int l=0;
		b[0][1]=1;
		b[0][2]=1;
		for(int i=1;i<n;i++)
		{if(b[l][2]==1)
		{a[i]=0;
		l=0;
		b[l][0]=b[l][1];
		b[l][2]++;
		b[l][1]=i+1;
		}
		else
		{int k=b[l][1]-b[l][0];
		b[k][0]=b[k][1];
		l=k;
		a[i]=l;
		b[k][1]=i+1;
		b[k][2]++;}}
	//	for(int i=0;i<n;i++)
	//	System.out.print(a[i]+" ");
		System.out.println(b[a[n-1]][2]);
		    
		}
	}
}
