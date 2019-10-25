#include <bits/stdc++.h>

using namespace std;

int main()
{
    int t,n,sum,cnt;
    cin>>t;
    int g[1010];
    while(t--)
    {
        cnt=0;
        cin>>n;
        sum=0;
        for(int i=0;i<n;i++)
        {
            cin>>g[i];
            sum+=g[i];
        }
        double avg=sum/n;
        for(int i=0;i<n;i++)
        {
            if(g[i]>avg)
            {
                cnt++;
            }
        }
        double outt=(cnt*100.0)/(double)n;
        printf("%.3lf%%\n",outt);
    }
}