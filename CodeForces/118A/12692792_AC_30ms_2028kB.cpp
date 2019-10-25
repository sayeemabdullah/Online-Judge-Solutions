#include <bits/stdc++.h>
using namespace std;

string lower(string a) {
    string b;
   for(int i=0;i<a.length();i++){
    b+=tolower(a[i]);
   }
   return b;
}
string removeVowels (string c){
    string d;
    for(int i=0;i<c.length();i++){
        if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u' || c[i]=='y'){
        }
        else{
        d+=c[i];
        }
    }
    return d;

}

string dotted (string e){
    string f;
    for(int i=0;i<e.length();i++){
        f+=".";
        f+=e[i];
    }
    return f;

}
int main() {

  int X,A,B;
  string petya;
  cin>>petya;
  cout<<dotted(removeVowels(lower(petya)))<<endl;
  return 0;
}
