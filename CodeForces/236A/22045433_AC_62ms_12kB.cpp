#include <bits/stdc++.h>
using namespace std;

int main() {
  int a[27];
  string str;
  memset(a, 0 , sizeof(a));
  cin>>str;
  for(int i=0;i<str.size();i++){
    a[str[i]-'a']++;
  }
  int counter=0;
   for(int j=0;j<26;j++){
     if(a[j]>0){
       counter++;
     }
   }
   //cout<<counter<<endl;
   if(counter%2==0){
     cout<<"CHAT WITH HER!"<<endl;
   }
   else{
     cout<<"IGNORE HIM!"<<endl;
   }
}