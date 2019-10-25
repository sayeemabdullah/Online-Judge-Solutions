#include <bits/stdc++.h>

using namespace std;

int main()
{
    int T,G,I,N,Q;
    cin>>T;
    for(int i=0;i<T;i++){
        cin>>G;
        for(int j=0;j<G;j++){
            cin>>I>>N>>Q;
            if(N%2==0){
              cout<<N/2<<endl;
            }
            else{
                if(I==1){
                    if(Q==1){
                        cout<<N/2<<endl;
                    }
                    else{
                        cout<<(N+1)/2<<endl;
                    }
                }
                else{
                    if(Q==1){
                        cout<<(N+1)/2<<endl;
                    }
                    else{
                        cout<<N/2<<endl;
                    }
                }
            }
        }
    }
    return 0;
}
