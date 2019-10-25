#include <bits/stdc++.h>

using namespace std;

int main()
{
    {

    int T,num,notun;
    cin>>T;
    for(int i=0;i<T;i++){
        cin>>num;
        int four=0;
        notun=num%10;
        while(num>9){
            num=num/10;
            }
        cout<<notun+num<<endl;
    }
    return 0;
}
}
