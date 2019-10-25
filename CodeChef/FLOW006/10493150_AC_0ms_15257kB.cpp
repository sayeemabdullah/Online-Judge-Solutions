#include <bits/stdc++.h>
using namespace std;

int main()
{
    int T,N,X,Y,sum;
    cin>>T;
    for(int j=1;j<=T;j++){
        cin>>N;
        sum=0;
    while(N>0){
        X=N%10;
        N=N/10;
        sum=sum+X;
        }
        cout<<sum<<endl;
    }
    return 0;
}
