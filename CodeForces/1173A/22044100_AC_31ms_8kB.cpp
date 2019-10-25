#include <bits/stdc++.h>

using namespace std;

int main()
{
    int a,b,c;
    cin>>a>>b>>c;

    if(a==b && c==0){
        cout<<0<<endl;
    }
    else if(a>b && a>b+c){
            cout<<"+"<<endl;
        }
    else if(b>a && b>a+c){
            cout<<"-"<<endl;
        }
    else{
            cout<<"?"<<endl;
        }


    return 0;
}
