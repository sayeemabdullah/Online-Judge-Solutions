#include <bits/stdc++.h>
using namespace std;

int main() {
    int T;
    cin>>T;
  for(int i=0;i<T;i++){
    int total=0,a,j;
    cin>>a;
    for(j=1;(j*j)<a;j++){
        if(a%j==0){
            total+=j+a/j;
        }
    }
    if(j*j == a){
        total+=j;
    }
    total-=a;
    printf("%d\n",total);
  }
    return 0;
}
