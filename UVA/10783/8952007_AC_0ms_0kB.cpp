#include <iostream>

using namespace std;

int main()
{
    int T,s,e;
    cin>>T;
    for(int i=1;i<=T;i++){
        int sum=0;
        cin>>s>>e;
        for(int j=s;j<=e;j++){
            if(j%2!=0){
                sum+=j;
            }
        }
     cout<<"Case "<<i<<": "<<sum<<endl;
    }
}
