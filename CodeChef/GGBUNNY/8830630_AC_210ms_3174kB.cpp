#include <bits/stdc++.h>
using namespace std;
int main()

{
    int t,c,a,b;
    long long int num,pow;
    string s;
    cin>>t;
    while(t--)
    {
        c=0;
        cin>>a>>b;

        while(a--)
        {
            cin>>num;
            if(b==1&&num==1)
                c++;

            else
            {
                pow=1;
                while(pow<num)
                {
                    pow*=b;
                }

                if(pow==num)
                    c++;


            }

        }
        cout<<c<<endl;
    }
}