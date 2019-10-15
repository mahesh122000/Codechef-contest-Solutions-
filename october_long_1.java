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
		{a[i]=s.nextInt();}
		int count=1;
		int min1=a[0];
		int x=0;
		int min2=99999;
		int b[]=new int[5];
		int j=0;
		if(n<=6)
		{for(int i=1;i<n;i++)
		{if(a[i]<min1)
		{count++;min1=a[i];}}}
		else
		{for(int i=1;i<=5;i++)
		{b[j]=a[i];j++;
		    if(a[i]<min1)
		{count++;min1=a[i];}}
		for(int i=6;i<n;i++)
		{boolean flag=true;
		for(int k=0;k<5;k++)
		{
		if(a[i]<b[k])
		{}
		else
		{flag=false;break;}}
		if(flag)
		{count++;}
		else{}
		j=j%5;
		b[j]=a[i];j++;
		}}
		System.out.println(count);}
	}
}