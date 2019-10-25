#include <bits/stdc++.h>
using namespace std;
int main(){
  int T;
  cin>>T;
  for(int i=0;i<T;i++){
    int count=0,a,temp;
    cin>>a;
    count+=(a/100);
    a=a%100;
    count+=(a/50);
    a=a%50;
    count+=(a/10);
    a=a%10;
    count+=(a/5);
    a=a%5;
    count+=(a/2);
    a=a%2;
    count+=(a/1);
    cout<<count<<endl;
  }
  return 0;
}