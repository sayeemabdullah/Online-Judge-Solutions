#include <bits/stdc++.h>

using namespace std;

int main()
{
    int T;
    cin>>T;
    int a[T];
    int sum1=0,sum2=0;
    for(int i=0;i<T;i++){
        for(int j=0;j<T;j++){
            cin>>a[j];
        }
        sum1=sum1+a[i];
        sum2=sum2+a[T-(i+1)];
    }
     int sum = sum1-sum2;
     if(sum<0){
        sum=sum*-1;
     }
     cout<<sum<<endl;
    return 0;
}
