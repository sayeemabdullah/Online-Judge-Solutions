#include <bits/stdc++.h>
using namespace std;

int remainAmount(int a, int b) {
   int counter = 0;
   while (a>=b){
      a-=b;
   }
   return a;
}

int main() {

  int X,A,B,newAmount;
  cin>>X>>A>>B;
  X=X-A;
  cout<<remainAmount(X,B)<<endl;
  return 0;
}
