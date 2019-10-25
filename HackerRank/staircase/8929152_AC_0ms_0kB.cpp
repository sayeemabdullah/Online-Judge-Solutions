#include <bits/stdc++.h>

using namespace std;

int main()
{
    int height;
    cin>>height;
    for (int linecount=1; linecount<=height; linecount++)
    {
      for (int space=1; space<=(height-linecount); space++)
      {
        cout<<" ";
      }
      for (int starcount=1; starcount<=linecount; starcount++)
      {
        cout<<"#";
      }
      cout<<"\n";
    }

    return 0;
}
