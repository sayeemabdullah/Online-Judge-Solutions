#include<bits/stdc++.h>
using namespace std;
int a[1000100]={0};
void cubefree()
{
    int i,j,k;
    for(i=2;i<=100;i++)
    {
        if(a[i]==0)
        {
            k=i*i*i;
        }
        for(j=k;j<=1000000;j+=k)
        {
            a[j]=-1;
        }
    }
    k=1;
    for(i=1;i<=1000000;i++)
    {
        if(a[i]==0)
        {
            a[i]=k++;
        }
    }
}
int main()
{
    cubefree();
    int t,n;
    scanf("%d",&t);
    for(int i=1; i<=t;i++)
    {
        cin>>n;
        if(a[n]!=-1)
        printf("Case %d: %d\n",i,a[n] );
        else
        printf("Case %d: Not Cube Free\n",i);
    }
}