#include <bits/stdc++.h>

using namespace std;

int main()
{
    int T,n;
    cin>>T;
    long long int a[5005];
    long long int m;
    while(T--)
    {
        memset(a,0,sizeof(a));
        cin>>n;
        for(int i=0;i<n;i++)
        {
            cin>>a[i];
        }
        sort(a,a+n);
       m=a[1]-a[0];
       for(int i=1;i<n-1;i++)
       {
           if(a[i+1]-a[i]<m)
           {
               m=a[i+1]-a[i];
           }
       }
       cout<<m<<endl;
    }
}