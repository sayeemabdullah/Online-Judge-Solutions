#include <iostream>

using namespace std;

int main()
{

    int T;
    cin>>T;
    for(int i=1;i<=T;i++){
        int a,counterLow=0,counterHigh=0;
        cin>>a;
        int b[a];
        cin>>b[0];
        for(int j=1;j<a;j++){
            cin>>b[j];
            if(b[j]<b[j-1]){
                counterLow++;
            }
            else if(b[j]>b[j-1]){
                counterHigh++;
            }
            }

        cout<<"Case "<<i<<": "<<counterHigh<<" "<<counterLow<<endl;
    }

    return 0;

}
