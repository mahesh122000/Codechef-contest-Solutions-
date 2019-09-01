import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	while(n-->0)
	{int a[]=new int[3];
	int b[]=new int[3];
	for(int i=0;i<3;i++)
	a[i]=s.nextInt();
	for(int j=0;j<3;j++)
	b[j]=s.nextInt();
	for(int i=0;i<2;i++)
	{for(int j=0;j<2-i;j++)
	{if(a[j]>a[j+1])
	{int t=a[j];
	a[j]=a[j+1];
	a[j+1]=t;
	t=b[j];
	b[j]=b[j+1];
	b[j+1]=t;}}}
	boolean flag=true;
	for(int i=0;i<2;i++)
	{if(a[i]<a[i+1] && b[i]<b[i+1])
	flag=true;
	else if(a[i]==a[i+1] && b[i]==b[i+1])
	flag=true;
	else
	{flag=false;
	break;}}
	if(flag)
	System.out.println("FAIR");
	else
	System.out.println("NOT FAIR");}
	}
}