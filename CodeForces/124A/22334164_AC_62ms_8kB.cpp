#include <iostream>

using namespace std;

int main()
{
    int n,a,b;
    cin>>n>>a>>b;
    int counter=0;
    for(int i=a+1;i<=n;i++){
       if(i-1>=a && n-i<=b){
       counter++;
    }
    }
    cout<<counter<<endl;
    return 0;
}
