#include <bits/stdc++.h>

using namespace std;

int main()
{
    int N,T;
    cin>>T;
    for(int j=0;j<T;j++){
    long long sum=0;
    cin>>N;
    for(int i=10;i<=N;i=i+10){
        sum+=(i/10)*10;
    }
    cout<<sum<<endl;
    }

    return 0;
}
