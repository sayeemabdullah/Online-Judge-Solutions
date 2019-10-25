#include <bits/stdc++.h>

using namespace std;

int main()
{
    string S,str;
    cin>>S;
    int T;
    cin>>T;
    for(int i=0;i<T;i++){
        bool checker = true;
        cin>>str;
        for(int j=0;j<str.size();j++){
            int b = S.find(str[j]);
            if(b==-1){
                cout<<"No"<<endl;
                checker = false;
                break;
            }
        }
        if(checker==true){
        cout<<"Yes"<<endl;
        }
    }
    return 0;
}
