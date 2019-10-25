#include <bits/stdc++.h>

using namespace std;

int main()
{

    int T,N,temp;
    cin>>T;
    for(int i=1;i<=T;i++){
     cin>>N;
     int count1=0;
     while(N>0){
     temp=N%2;
     N=N/2;
    if(temp==1){
        count1++;
    }
     }
     if(count1%2==0){
        cout<<"Case "<<i<<": even"<<endl;
     }
     else{
        cout<<"Case "<<i<<": odd"<<endl;
     }
    }
    return 0;
}
