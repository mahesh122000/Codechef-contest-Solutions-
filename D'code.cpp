#include <iostream>
using namespace std;

int main() {


		int t;
		cin>>t;
		while(t--)
		{int n,m,hr,vr,ss;
		cin>>n>>m;
		cin>>hr>>vr>>ss;
		int h[hr+1];
		int v[vr+1];
		for(int i=0;i<hr;i++)
		{int kk;
		cin>>kk;
		h[i]=kk;}
		h[hr]=n+1;
		    for(int i=0;i<vr;i++)
		{int kk;
		cin>>kk;
		v[i]=kk;}
		v[vr]=m+1;
		int count=0;
		int p=0,q=0;
		if(hr>=1 && vr>=1)
		{for(int i=0;i<=hr;i++)
		{int qq=h[i]-q;
		qq--;p=0;
		if(qq>=ss)
		{for(int j=0;j<=vr;j++)
		{int pp=v[j]-p;
		pp--;
		 int kk=min(pp,qq);
		 if(kk>=ss)
		 {count+=(pp/ss)*(qq/ss);
		     
		 }
		    p=v[j];
		}}
		    q=h[i];
		}}
		else
		{if(hr==0)
		{for(int i=0;i<=vr;i++)
		{int pp=v[i]-p;
		pp--;
		if(pp>=ss)
		{count+=(pp/ss)*(n/ss);}
		p=v[i];}}
		else if(vr==0)
		{for(int i=0;i<=hr;i++)
		{int pp=h[i]-p;
		pp--;
		if(pp>=ss)
		{count+=(pp/ss)*(m/ss);}
		p=h[i];}}}
		cout<<count<<endl;}

	
	
	return 0;
}
