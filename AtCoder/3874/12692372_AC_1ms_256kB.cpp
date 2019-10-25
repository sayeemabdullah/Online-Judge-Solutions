#include <bits/stdc++.h>
using namespace std;

int concatenation(int a, int b) {
   int counter = 1;
   while (counter <= b)
      counter *= 10;
   return a*counter + b;
}

int main() {

  int A,B,C,D;
  cin>>A>>B;
  C=concatenation(A,B);
  D=sqrt(C);
  if(C==(D*D)){
    cout<<"Yes"<<endl;
  }
  else{
    cout<<"No"<<endl;
  }
  return 0;
}
