#include <bits/stdc++.h>
using namespace std;

int main()
{
    int T,N;
    cin>>T;
    for(int i=1;i<=T;i++){
      cin>>N;
      int c[N];
      cin>>c[0];
      int max=c[0];
      for(int count=1;count<N;count++){
         cin>>c[count];
        if(c[count]>max){
            max=c[count];
        }
      }
      cout<<"Case "<<i<<": "<<max<<endl;
    }
    return 0;
}
