#include <iostream>

using namespace std;

int main()
{
    int n,a,b;
    cin>>a>>b;
    int counter=1;
    for(int i=1;i<=min(a,b);i++){
       counter*=i;
    }
    cout<<counter<<endl;
    return 0;
}
