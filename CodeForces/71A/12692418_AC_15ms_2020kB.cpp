#include <bits/stdc++.h>
using namespace std;

int concatenation(int a, int b) {
   int counter = 1;
   while (counter <= b)
      counter *= 10;
   return a*counter + b;
}

int main() {

  int A,B,C,D,T;
  cin>>T;
  for(int i=0;i<T;i++){
   string S;
   cin>>S;
   if(S.length()<=10){
    cout<<S<<endl;
  }
  else{
    cout<<S[0]<<(S.length()-2)<<S[S.length()-1]<<endl;
  }
  }
  return 0;
}
