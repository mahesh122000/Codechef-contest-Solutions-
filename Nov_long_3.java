/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    public static double dist(long a,long b,long c,long d)
    {double ans=Math.sqrt((a-c)*(a-c)+(b-d)*(b-d));
    return ans;}
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner s=new Scanner(System.in);
	   int t=s.nextInt();
	   while(t-->0)
	   {long x=s.nextLong();
	   long y=s.nextLong();
	   int n=s.nextInt();
	   int m=s.nextInt();
	   int k=s.nextInt();
	   long a[][]=new long[n][2];
	   long c[][]=new long[m][2];
	   long e[][]=new long[k][2];
	   for(int i=0;i<n;i++)
	   {for(int j=0;j<2;j++)
	   a[i][j]=s.nextLong();}
	   for(int i=0;i<m;i++)
	   {for(int j=0;j<2;j++)
	   c[i][j]=s.nextLong();}
	   for(int i=0;i<k;i++)
	   {for(int j=0;j<2;j++)
	   e[i][j]=s.nextLong();}
	   double ans=0,min=Double.MAX_VALUE;
	   for(int i=0;i<n;i++)
	   {for(int j=0;j<m;j++)
	   {for(int r=0;r<k;r++)
	   {double temp=dist(x,y,a[i][0],a[i][1])+dist(c[j][0],c[j][1],a[i][0],a[i][1])+dist(e[r][0],e[r][1],c[j][0],c[j][1]);
	   if(temp<min)
	   min=temp;}}}
	   for(int i=0;i<m;i++)
	   {for(int j=0;j<n;j++)
	   {for(int r=0;r<k;r++)
	   {double temp=dist(x,y,c[i][0],c[i][1])+dist(a[j][0],a[j][1],c[i][0],c[i][1])+dist(e[r][0],e[r][1],a[j][0],a[j][1]);
	   if(temp<min)
	   min=temp;}}}
	   System.out.format("%.10f",min);
	       System.out.println();
	   }
	}
}
