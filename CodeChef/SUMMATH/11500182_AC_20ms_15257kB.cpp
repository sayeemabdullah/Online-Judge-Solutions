#include <iostream>

using namespace std;

int main()
{
    long T,N,sum;
    cin>>T;
    for(int i=0;i<T;i++){
        cin>>N;
        sum=0;
        for(long j=10; j<=N; j+=10){
          sum=sum+j;
    }
    cout<<sum<<endl;
    }
    return 0;
}
