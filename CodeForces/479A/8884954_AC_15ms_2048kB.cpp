#include <bits/stdc++.h>

using namespace std;

int main()
{
    int a,b,c,max,sum;
    cin>>a>>b>>c;
    sum=a+b*c;
    max=sum;
    sum =a*(b+c);
    if(sum>max){
        max=sum;
    }
    sum=a*b*c;
    if(sum>max){
        max=sum;
    }
    sum=(a+b)*c;
    if(sum>max){
        max=sum;
    }
    sum=a+b+c;
    if(sum>max){
        max=sum;
    }
    
    cout<<max<<"\n";

    return 0;
}
