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
		long k=s.nextLong();
		long a[]=new long[n];
		long b[]=new long[n];
		ArrayList<Long>hs=new ArrayList<Long>();
		for(int i=0;i<n;i++)
		{a[i]=s.nextLong();b[i]=a[i];hs.add(b[i]);}
		Arrays.sort(b);
		long ans=0;
		for(int i=0;i<n;i++)
		{
		for(int j=0;j<n;j++)
		{if(b[j]==a[i])
		{
		    ans+=(j*(k)*(k-1))/2;break;
		    
		}}}  
		for(int i=0;i<n;i++)
		{for(int j=i+1;j<n;j++)
		{if(a[i]>a[j])
		ans+=k;}}
		System.out.println(ans);}
	}
}
