#include <bits/stdc++.h>

using namespace std;

int main()
{
    int T,N,K;
    cin>>T;
    for(int i=0;i<T;i++){
        cin>>N>>K;
        int H = 0;
        for(int i=1;i<=K;i++){
	       int T= N%i;
	       if(T>H)
	       H=T;
	    }
	    cout<<H<<endl;
    }
    return 0;
}
