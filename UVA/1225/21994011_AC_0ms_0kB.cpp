#include <bits/stdc++.h>
using namespace std;

int main() {
  int test;
  cin>>test;
  for(int c=0;c<test;c++){
  int a , arr[10];
  memset(arr, 0, 10*sizeof(arr[0]));
  cin>>a;
  string str;
  for(int i=1;i<=a;i++){
    str+=std::to_string(i);
  }
    //cout<<str<<endl;
    for(int i=0;i<=9;i++){
    arr[i]=count(str.begin(), str.end(),i+'0');
    }
    for(int i=0;i<=9;i++){
            if(i!=9){
        cout<<arr[i]<<" ";
    }
    else{
        cout<<arr[i]<<endl;
    }
    }
  }
    return 0;
}
