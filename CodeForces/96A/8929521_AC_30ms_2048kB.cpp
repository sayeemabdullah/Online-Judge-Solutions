#include <bits/stdc++.h>
using namespace std;

int main()
{
    string s;
    cin>>s;
    int c=1;
    bool same=false;
    for(int i=1;i<s.length();i++)
    {
        if(s[i]==s[i-1])
        {
            c++;
            if(c==7)
            {
                cout<<"YES"<<endl;
                same=true;
                break;
            }
        }
        else
        {
            c=1;
        }
    }
    if(same==false)
    {
        cout<<"NO"<<endl;
    }
}
