#include <bits/stdc++.h>

using namespace std;

int main()
{
    int T;
    cin>>T;
    for(int i=0;i<T;i++){
        int number,temp,sum=0;
        cin>>number;
        sum=number%10;
        while(number>9){
            number=number/10;
        }
        sum+=number;
        cout<<sum<<endl;
    }
    return 0;
}
