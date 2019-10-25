#include <iostream>

using namespace std;

int main()
{
    int T,m,n;
    cin>>T;
    cin>>n;
    cin>>m;
    for(int count=1;count<=T;count++){
       int number = 0;
       for(int counter=1;counter>0;counter++){
        if(m>n){
            break;}
        else if(m*2==n){
            break;
        }
        else if(m!=n){
            m++;
            number++;
        }
        else if(m==n){
            break;
        }
        }
       cout<<number<<"\n";

    }
}
