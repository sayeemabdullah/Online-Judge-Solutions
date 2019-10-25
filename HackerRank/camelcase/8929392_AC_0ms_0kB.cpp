#include <bits/stdc++.h>
using namespace std;


int main()

{  int upper=1;
   string str;
   cin>>str;
   for(int i = 0;i<str.length();i++)
   {
    if(str[i]>= 'A' && str[i] <= 'Z'){
      upper++;
    }
}
   cout<<upper<<endl;

  return 0;
}
