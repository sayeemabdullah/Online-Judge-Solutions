#include <bits/stdc++.h>
using namespace std;


int main()

{  int S;
   cin>>S;
   for(int c=1;c<=S;c++){
   string str;
   cin>>str;
   int value = str.length();
   if(value<=10){
     cout<<str<<endl;
   }
     else{
        int num= value - 2;
        cout<<str[0]<<num<<str[value-1]<<endl;
     }
   }
  return 0;
}
