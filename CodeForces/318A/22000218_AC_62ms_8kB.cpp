#include <bits/stdc++.h>
using namespace std;

int main() {
    long long n,s,x,c;
    cin>>n>>s;
  if (s <= (n + 1) / 2)
    {
        cout << s * 2 - 1 << endl;
    }
    else
    {
        cout << (s - (n + 1) / 2) * 2 << endl;
    }
    return 0;
}