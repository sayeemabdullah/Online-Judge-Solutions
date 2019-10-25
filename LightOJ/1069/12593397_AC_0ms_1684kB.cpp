#include <bits/stdc++.h>

using namespace std;

int main()
{
    int T;
    cin>>T;
    for(int i=1;i<=T;i++){
        int liftPostion,myPostion,sum=19;
        cin>>myPostion>>liftPostion;
        if(liftPostion>=myPostion){
            sum=sum+(liftPostion*4);
        }
        else if(myPostion>liftPostion){
            liftPostion=myPostion+(myPostion-liftPostion);
            sum=sum+(liftPostion*4);
        }
        cout<<"Case "<<i<<": "<<sum<<endl;

    }
    return 0;
}
