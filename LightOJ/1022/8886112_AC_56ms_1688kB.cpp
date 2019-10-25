#include <bits/stdc++.h>
#include <math.h>

using namespace std;
const double PI=2*acos(0.0);
int main()
{
  int N;
  cin>>N;
  double a,ans,d,c,area;
  for(int i=1;i<=N;i++){
    cin>>a;
    d=a*2;
    area=d*d;
    c=PI * a * a;
    ans = (area - c) + 0.000000001;

    printf("Case %d: %.2lf\n",i,ans);
  }

}
