#include <bits/stdc++.h>

using namespace std;

int main()
{
    int T,A,B,C;
    cin>>T;
    for(int i=1;i<=T;i++){
    cin>>A>>B>>C;
    if((A<B && A>C) || (A>B && A<C) ){
      cout<<"Case "<<i<<": "<<A<<endl;
      }
      else if((B<A && B>C) || (B>A && B<C) ){
            cout<<"Case "<<i<<": "<<B<<endl;

      }
      else{
          cout<<"Case "<<i<<": "<<C<<endl;
      }
    }


    return 0;
}
