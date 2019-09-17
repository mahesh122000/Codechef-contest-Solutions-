import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    
   // public final static int SIZE = 200; 
    public static long binomialCoeff(int n,  
                                    int k) 
    { 
        long res = 1; 
        if (k > n - k) 
            k = n - k; 
        for (int i = 0; i < k; ++i)  
        { 
            res *= (n - i); 
            res /= (i + 1); 
        } 
  
        return res; 
    } 
    public static long countSubsequences(int[] a,  
                                        int[] b,int SIZE) 
    { 
        int[] freq1 = new int [SIZE];  
        int[] freq2 = new int [SIZE]; 
        int n1 = a.length; 
        int n2 = b.length; 
        for (int i = 0; i < n1; i++) 
            freq1[a[i]]++; 
        for (int i = 0; i < n2; i++) 
            freq2[b[i]]++; 
        long count = 1; 
  
        for (int i = 0; i < SIZE; i++) 
            {if (freq2[i] != 0) { 
                if (freq2[i] <= freq1[i]) 
                    count = count * binomialCoeff(freq1[i], freq2[i]); 
                else
                    return 0; 
            }} 
        return count; 
    }   
      
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{int n=s.nextInt();
		int k=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{a[i]=s.nextInt();
		b[i]=a[i];}
		Arrays.sort(b);
		int ll=b[n-1];
		int c[]=new int[k];
		for(int i=0;i<k;i++)
		{c[i]=b[i];}
		long ck=countSubsequences(a,c,ll+1);
		System.out.println(ck);}
	}
}