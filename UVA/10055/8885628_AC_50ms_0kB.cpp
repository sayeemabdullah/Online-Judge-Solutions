#include <bits/stdc++.h>

using namespace std;

int main()
{
    long long int a,b,sum;
    while(scanf("%lld%lld",&a,&b)!=EOF){
        sum=b-a;
        if(sum<0){
            sum=sum*-1;
        }
        cout<<sum<<endl;
    }

}
