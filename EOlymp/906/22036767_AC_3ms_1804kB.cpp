#include <bits/stdc++.h>

using namespace std;

int main()
{
    int N,temp,sum=1;
    cin>>N;
    while(N!=0){
        sum*=(N%10);
        N=N/10;
    }
    cout<<sum<<endl;

    return 0;
}
