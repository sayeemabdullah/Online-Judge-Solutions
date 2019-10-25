#include <bits/stdc++.h>

using namespace std;

int main()
{
    int c1,c2,t;
    cin>>c1>>c2;
    if(c1>c2){
        t=c1-c2;
    }
    else{
        t=c1+c2;
    }
    cout<<t<<endl;
    return 0;
}