#include <bits/stdc++.h>

using namespace std;

int main()
{
    int T;
    cin>>T;
    for(int i=1;i<=T;i++){
    cout<<"Case "<<i<<":"<<endl;
    stack <string> s1;
    stack <string> s2;
    s1.push("http://www.lightoj.com/");
    string web,command;
    while(cin>>command && command!="QUIT"){
     if(command=="VISIT"){
         cin>>web;
         s1.push(web);
         cout<<s1.top()<<endl;
         if(!s2.empty()){
           while(!s2.empty()){
                s2.pop();}
        }
     }
     else if(command=="BACK"){
        if(s1.empty()){
            cout<<"Ignored"<<endl;
        }
        else{
            s2.push(s1.top());
            s1.pop();
            if(s1.empty()){
            cout<<"Ignored"<<endl;
            s1.push(s2.top());
            s2.pop();
            }
            else{
            cout<<s1.top()<<endl;
        }
        }
     }
     else if(command=="FORWARD"){
        if(!s2.empty()){
            s1.push(s2.top());
            s2.pop();
            cout<<s1.top()<<endl;
        }
        else{
            cout<<"Ignored"<<endl;
        }
        }
     }
    }
    return 0;
}
