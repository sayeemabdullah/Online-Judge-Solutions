#include <bits/stdc++.h>

using namespace std;

int main()
{
    int T,A,B,C;
    cin>>T;
    for(int i=1;i<=T;i++){
    cin>>A>>B>>C;
    if((A<=20 && B<=20 && C<=20) ){
      cout<<"Case "<<i<<": good"<<endl;
      }
    else{
       cout<<"Case "<<i<<": bad"<<endl;
      }
    }


    return 0;
}
