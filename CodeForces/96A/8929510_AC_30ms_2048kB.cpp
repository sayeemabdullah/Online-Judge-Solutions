#include <bits/stdc++.h>
using namespace std;

int main()
{
    string s;
    cin>>s;
    int cnt=1;
    bool same=false;
    for(int i=1;i<s.length();i++)
    {
        if(s[i]==s[i-1])
        {
            cnt++;
            if(cnt==7)
            {
                cout<<"YES"<<endl;
                same=true;
                break;
            }
        }
        else
        {
            cnt=1;
        }
    }
    if(same==false)
    {
        cout<<"NO"<<endl;
    }
}