#include <iostream>

using namespace std;

int main()
{
    int T,sum=0;
    cin>>T;
    for(int i=0;i<T;i++){
        string s;
        cin>>s;
        if(s=="X++" || s=="++X"){
            sum++;
        }
        else{
            sum--;
        }
    }

        cout<<sum<<endl;

    return 0;
}
