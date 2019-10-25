#include <bits/stdc++.h>

using namespace std;

int main()
{   string s;
    for(int i=1;i>0;i++){
      cin>>s;
      if(s=="Hajj"){
        cout<<"Case "<<i<<": Hajj-e-Akbar"<<endl;
      }
      else if(s=="Umrah"){
        cout<<"Case "<<i<<": Hajj-e-Asghar"<<endl;
      }
      else if(s=="*"){
        break;
      }
    }
    return 0;
}
