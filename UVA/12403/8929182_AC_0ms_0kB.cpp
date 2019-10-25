#include <bits/stdc++.h>

using namespace std;

int main()
{
    string s;
    int O,M;
    cin>>O;

    int donate=0;
        for(int j=1;j<=O;j++){
            cin>>s;
            if(s=="donate"){
                cin>>M;
                donate=donate+M;
            }
            else{
                cout<<donate<<endl;
            }
        }
    return 0;
}
