#include <iostream>
using namespace std;

int min(int a, int b); 

int min(int a, int b) 
{ 
    return (a < b) ? a : b; 
}


int main() {

		int t;
		cin>>t;
		while(t--)
		{int n;
		cin>>n;
		string a;
		cin>>a;
		string b;
		cin>>b;
		int count1=0;
		int count2=0;
		for(int i=0;i<n;i++)
		{if(a[i]=='1')
		count1++;
		if(b[i]=='1')
		count2++;}
		long ans=0;
		int aa=n-(count1+count2);
		if(aa<=0)
		{aa+=n;}
		int bb=abs(count1-count2);
		int k=aa;
		int C[n + 1][k + 1]; 
        int i, j; 
        for (i = 0; i <= n; i++) 
        {for (j = 0; j <= min(i, k); j++) 
        {if (j == 0 || j == i) 
            C[i][j] = 1; 
        else
            C[i][j] = (C[i - 1][j - 1]+C[i - 1][j])%1000000007;}}
		
		
		for(int i=bb;i<=aa;i+=2)
		{ans=(ans+C[n][i])%1000000007;}
		
		cout<<ans<<endl;}
	return 0;
}
