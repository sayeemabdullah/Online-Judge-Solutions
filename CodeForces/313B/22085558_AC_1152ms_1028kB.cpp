#include <bits/stdc++.h>

using namespace std;

int main()
{
    string A;
    cin>>A;
    int asize = A.size() + 1;
    int arr[asize];
    int asum[asize];
    memset(arr,0,asize*sizeof(arr[0]));
    memset(asum,0,asize*sizeof(asum[0]));
    for(int i=0;i<A.size()-1;i++){
        if(A[i]==A[i+1]){
            arr[i+1]=1;
        }
    }
    int n= sizeof(asum)/sizeof(asum[0]);
    int total = 0;
    for(int i=1;i<n;i++){
        total+=arr[i];
        asum[i]=total;
    }
    int T,a,b;
    cin>>T;
    for(int i=0;i<T;i++){
        cin>>a>>b;
        cout<<asum[b-1] - asum[a-1]<<endl;
    }
    return 0;
}
