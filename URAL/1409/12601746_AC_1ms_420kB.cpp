#include <bits/stdc++.h>

using namespace std;

int main()
{
    int T,A,B,C;
    //cin>>T;
    //for(int i=1;i<=T;i++){
    cin>>A>>B;
    C=(A+B)-1;
    A=C-A;
    B=C-B;
    /*if((A<=20 && B<=20 && C<=20) ){
      cout<<"Case "<<i<<": good"<<endl;
      }
    else{
       cout<<"Case "<<i<<": bad"<<endl;
      }
    }*/
    cout<<A<<" "<<B<<endl;

    return 0;
}
