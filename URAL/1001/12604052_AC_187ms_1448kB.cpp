#include <bits/stdc++.h>

using namespace std;
 double a[128*1024];
int main()
{
   int i=0;
   unsigned long long n;
   while(cin>>n){
   a[i++]=(double)sqrt(n);
   //sqrt(a[i]);
   //i++;
   }
    for (;--i>=0; ) {
        printf("%.4lf\n", a[i]);
    }

    return 0;
}
