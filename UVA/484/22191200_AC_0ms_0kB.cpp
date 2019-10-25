#include <bits/stdc++.h>

using namespace std;

int main()
{
    long long n;
    map<int,bool>checker;
    map<int,int>value;
    vector<int>seq;
    while(cin>>n)
    {
        if(checker[n]==false)
        {
            seq.push_back(n);
            checker[n]=true;
        }
        value[n]++;
    }
    for(int i=0; i<seq.size(); i++)
    {
        cout<<seq[i]<<" "<<value[seq[i]]<<endl;
    }
    return 0;
}
