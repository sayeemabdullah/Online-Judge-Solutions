#include <bits/stdc++.h>
using namespace std;
int main(){
  int T;
  cin>>T;
  int a[T],oddcount=0,evencount=0;
  for(int i=0;i<T;i++){
    cin>>a[i];
    if(a[i]%2==0){
      evencount++;
    }
    else{
      oddcount++;
    }
  }
  if(oddcount>=evencount){
    cout<<"NOT READY"<<endl;
  }
  else{
    cout<<"READY FOR BATTLE"<<endl;
  }
  return 0;
}