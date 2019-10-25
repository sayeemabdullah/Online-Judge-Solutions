#include<bits/stdc++.h>

using namespace std;

int main()
{
    long long T,a,b,a0,b0,j=0;
    std::string Total;
    cin>>T;
    for(int i=0;i<T;i++){
        cin>>a>>b;
        Total="";
        while(a!=0 || b!=0){
        a0=a%10;
        b0=b%10;
        a=a/10;
        b=b/10;
        a0=a0+b0;
        a0=a0%10;
        Total+=(a0+'0');
        j++;
        }
        reverse(Total.begin(), Total.end());
        int b = atoi(Total.c_str());
        cout<<b<<endl;
        //cout<<(string)Total<<endl;
    }
    return 0;
}
