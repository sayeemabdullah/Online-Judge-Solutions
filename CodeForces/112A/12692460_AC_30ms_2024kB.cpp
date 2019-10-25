#include <bits/stdc++.h>
using namespace std;

int main() {
	string a;
	string b;
	cin>>a>>b;
	int sum1=0;
	int sum2=0;
	for(int i=0;i<a.length();i++)
    {
        a[i]=tolower(a[i]);

    }
    for(int j=0;j<b.length();j++)
    {
        b[j]=tolower(b[j]);
    }
    if(a==b)
        cout<<"0"<<endl;
    else
    {
        for(int i=0;i<a.length();i++)
        {
            if(a[i]<b[i])
            {
                cout<<"-1"<<endl;
                break;
            }
            if(a[i]>b[i])
            {
                cout<<"1"<<endl;
                break;
            }
        }
    }

}