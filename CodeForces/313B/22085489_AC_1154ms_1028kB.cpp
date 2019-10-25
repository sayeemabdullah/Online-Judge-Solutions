#include <bits/stdc++.h>

using namespace std;

int main()
{
    string S;
    cin>>S;
    int asize = S.size() + 1;
    int arr[asize];
    int asum[asize];
    memset(arr,0,asize*sizeof(arr[0]));
    memset(asum,0,asize*sizeof(asum[0]));
    for(int i=0;i<S.size()-1;i++){
        if(S[i]==S[i+1]){
            arr[i+1]=1;
        }
    }
    //print start
    //int k= sizeof(arr)/sizeof(arr[0]);
    //for(int i=0;i<k;i++){
    //    cout<<arr[i]<<" ";
    //}
    //cout<<""<<endl;
    //print end
    int n= sizeof(asum)/sizeof(asum[0]);
    int total = 0;
    for(int i=1;i<n;i++){
        total+=arr[i];
        asum[i]=total;
    }
    //Print start
    //for(int i=0;i<n;i++){
    //    cout<<asum[i]<<" ";
    //}
    //cout<<""<<endl;
    //print end
    int T,a,b;
    cin>>T;
    for(int i=0;i<T;i++){
        cin>>a>>b;
        cout<<asum[b-1] - asum[a-1]<<endl;
    }
    return 0;
}
