#include <iostream>

using namespace std;

int main()
{

    int T;
    cin>>T;
    cout<<"Lumberjacks:"<<endl;
    for(int i=0;i<T;i++){
        int a[10],flag=0;
        cin>>a[0]>>a[1];
        if(a[0]>a[1]){
        for(int i=2;i<10;i++){
         cin>>a[i];
         if(a[i]>a[i-1]){
            flag++;
         }
        }
        }
        else if(a[0]<a[1]){
           for(int i=2;i<10;i++){
         cin>>a[i];
         if(a[i]<a[i-1]){
            flag++;
         }
        }
        }
        if(flag==0){
            cout<<"Ordered"<<endl;
        }
        else{
            cout<<"Unordered"<<endl;
        }

  }
    return 0;

}
