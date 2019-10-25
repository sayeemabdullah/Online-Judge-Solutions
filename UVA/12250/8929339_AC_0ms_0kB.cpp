#include <bits/stdc++.h>
using namespace std;


int main()
{

    for(int i=1;i>0;i++){
        string str;
        cin>>str;
        if(str=="HELLO"){
            cout<<"Case "<<i<<": ENGLISH"<<endl;
        }
        else if(str=="HOLA"){
            cout<<"Case "<<i<<": SPANISH"<<endl;
        }
        else if(str=="HALLO"){
            cout<<"Case "<<i<<": GERMAN"<<endl;
        }
        else if(str=="BONJOUR"){
            cout<<"Case "<<i<<": FRENCH"<<endl;
        }
        else if(str=="CIAO"){
            cout<<"Case "<<i<<": ITALIAN"<<endl;
        }
        else if(str=="ZDRAVSTVUJTE"){
            cout<<"Case "<<i<<": RUSSIAN"<<endl;
        }
        else if(str=="#"){
            break;
        }
        else{
            cout<<"Case "<<i<<": UNKNOWN"<<endl;
        }
    }
}
