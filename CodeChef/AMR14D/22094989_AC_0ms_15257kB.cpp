#include <bits/stdc++.h>

using namespace std;

int main()
{
    int T,N;
    cin>>T;
    for(int k=0;k<T;k++){
    cin>>N;
    int dollsize[N];

    for(int i=0;i<N;i++){
        cin>>dollsize[i];
    }
    int* end = dollsize + N;
    std::sort(dollsize, end);
    bool containsDuplicates = (std::unique(dollsize, end) != end);
    //cout<<"Duplicate Checker : "<<containsDuplicates<<endl;
    if(containsDuplicates==1){
        cout<<"NO"<<endl;
    }
    else{
        cout<<"YES"<<endl;
    }

    }
    return 0;
}
