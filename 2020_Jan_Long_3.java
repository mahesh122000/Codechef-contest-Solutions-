/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int ans(int a[][],int p,int q)
    {
        int k=Math.min(p-0,Math.min(a.length-p-1,Math.min(q-0,a[p].length-q-1)));
        int count=0;
        for(int i=1;i<=k;i++)
        {if(a[p-i][q]==a[p+i][q] && a[p][q-i]==a[p][q+i])
        {count++;}
        else
        {break;}}
        return count;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{int n=s.nextInt();
		int m=s.nextInt();
		int a[][]=new int[n][m];
		int count=0;
		count=n*m;
		for(int i=0;i<n;i++)
		{for(int j=0;j<m;j++)
		a[i][j]=s.nextInt();}
		for(int i=1;i<n-1;i++)
		{for(int j=1;j<m-1;j++)
		{count+=ans(a,i,j);}}
		System.out.println(count);}}}