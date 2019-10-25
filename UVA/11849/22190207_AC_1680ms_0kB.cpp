#include <bits/stdc++.h>

using namespace std;

int main()
{
    int m,n;
    while(cin>>m>>n){
        map<long long,bool> vaal;
        if(m==0 && n==0){
            break;
        }
        int marr[m],narr[n];
        long long a;
        for(int i=0;i<m;i++){
            cin>>a;
            vaal[a]=true;
        }
        int answer=0;
        for(int i=0;i<n;i++){
            cin>>a;
            if(vaal[a]){
                answer++;
            }
        }
        cout<<answer<<endl;
    }
    return 0;
}
