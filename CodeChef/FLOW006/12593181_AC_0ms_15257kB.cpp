#include <bits/stdc++.h>

using namespace std;

int main()
{
    int T;
    cin>>T;
    for(int i=0;i<T;i++){
        int number,temp,sum=0;
        cin>>number;
        while(number!=0){
            sum+=number%10;
            number=number/10;
        }
        cout<<sum<<endl;
    }
    return 0;
}
