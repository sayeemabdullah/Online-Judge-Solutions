#include <bits/stdc++.h>

using namespace std;

int main()
{
    int T,num;
    cin>>T;
    for(int i=0;i<T;i++){
        cin>>num;
        int four=0,notun;
        while(num!=0){
            notun=num%10;
            num=num/10;
            if(notun==4){
                four++;
            }
        }
        cout<<four<<endl;
    }
    return 0;
}
