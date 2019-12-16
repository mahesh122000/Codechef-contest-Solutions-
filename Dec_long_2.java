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
		int count2=0;
		int count0=0;
		long a[]=new long[n];
		for(int i=0;i<n;i++)
		{a[i]=s.nextLong();
		if(a[i]==2)
		{count2++;}
		if(a[i]==0)
		count0++;
		}
		int ans=0;
		if(count2>=2)
		ans+=(count2*(count2-1))/2;
		if(count0>=2)
		ans+=(count0*(count0-1))/2;
		System.out.println(ans);
		}
	}
}
