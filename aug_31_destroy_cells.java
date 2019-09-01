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
		int a[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{for(int j=0;j<m;j++)
		a[i][j]=0;}
		System.out.print(n*m+" ");
		for(int i=1;i<n*m;i++)
		{int p=0;
		int q=0;
		int count=0;
		while(q<m)
		{if(a[p][q]==i)
		{}
		else
		{a[p][q]=i;
		count++;}
		p+=i+1;
		if(p>=n)
		{
		int r=p/n;
		p=p%n;
		q+=r;}
		}
		p=0;q=0;
		while(p<n)
		{if(a[p][q]!=i)
		{a[p][q]=i;
		count++;}
		q+=i+1;
		if(q>=m)
		{int r=q/m;
		    q=q%m;
		p+=r;}}
		    System.out.print(count+" ");
		}
		System.out.println();}
		
	}}