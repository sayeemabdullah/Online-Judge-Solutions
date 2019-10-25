#include <bits/stdc++.h>
using namespace std;

int main()
{
    int T,A,B;
    cin>>T;
    for(int i=0;i<T;i++){
    cin>>A>>B;
    printf("%d\n", __gcd(A,B));
    }
    return 0;
}
