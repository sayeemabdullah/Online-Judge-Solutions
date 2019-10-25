#include <iostream>
 
using namespace std;
 
int main()
{
 
    int T,a;
    cin>>T;
    for(int i=0;i<T;i++){
        cin>>a;
        if(a>10){
            cout<<10<<" "<<a-10<<endl;
        }
         else{
            cout<<a<<" "<<0<<endl;
         }
        }
 
 
    return 0;
}