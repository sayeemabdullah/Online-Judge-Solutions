#include <bits/stdc++.h>

using namespace std;

int main()
{
    int number;
    cin>>number;
    number=12-number;
    number=number*45;
    if(number>240){
        cout<<"NO"<<endl;
    }
    else{
        cout<<"YES"<<endl;
    }

    return 0;
}
