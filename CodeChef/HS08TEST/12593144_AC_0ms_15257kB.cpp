#include <bits/stdc++.h>

using namespace std;

int main()
{
    int X;
    double Y;
    cin>>X>>Y;
    if(X>Y || X%5!=0 || X>(Y-0.5)){
        printf("%.2lf\n",Y);
        //cout<<Y<<endl;
    }
    else{
        Y=(Y-X)-(0.5);
        //cout<<Y<<endl;
        printf("%.2lf\n",Y);
    }
    return 0;
}
