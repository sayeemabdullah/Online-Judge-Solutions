#include <bits/stdc++.h>

using namespace std;


int main()
{
    int T;
    cin>>T;
    getchar();
    getchar();
    while(T--)
    {
        map<string,int>tree;
        int counter=0;
        counter=0;
        string c;

        while(getline(cin, c))
        {
            if (c.compare("") == 0)
            {
                break;
            }
            else
            {
                tree[c]++;
                counter++;
            }
        }
        map<string, int>::iterator itr;
        for(map<string, int>::iterator i = tree.begin(); i != tree.end(); i++)
        {
            cout << i->first << " " << fixed << setprecision(4) << i->second*100.0/counter << endl;
        }
        if(T)
        {
            puts("");
        }
    }

    return 0;
}
