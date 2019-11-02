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
		int h=s.nextInt();
		int y1=s.nextInt();
		int y2=s.nextInt();
		int l=s.nextInt();
		int count=0;
		int a[][]=new int[n][2];
		for(int i=0;i<n;i++)
		{a[i][0]=s.nextInt();
		a[i][1]=s.nextInt();}
		int i=0;
		while(i<n && l>0)
		{int k=a[i][0];
	
		if(k==1)
		{int g=a[i][1];
		if(g>=h-y1)
		{}
		else
		{l--;}}
		else
		{int g=a[i][1];
		if(y2>=g)
		{}
		else
		{l--;}}	count++;i++;}
		if(l>0)
		{}
		else
		{count--;}
		System.out.println(count);}}}