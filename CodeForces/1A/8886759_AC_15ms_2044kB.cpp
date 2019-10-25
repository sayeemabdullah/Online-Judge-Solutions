#include <bits/stdc++.h>

using namespace std;

int main()

{
   long long int n,m,a;
   cin>>n>>m>>a;
   cout<<(long long) ceil((n+a-1)/a)* (long long) ceil((m+a-1)/a) << endl;

}
