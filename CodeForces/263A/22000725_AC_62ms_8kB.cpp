#include <bits/stdc++.h>
using namespace std;

int main() {
    int arr[5][5],a;
    memset(arr,0,5*5*sizeof(arr[0][0]));
    for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){
            cin>>a;
            arr[i][j]=a;
        }
    }
    if(arr[2][2]==1){
    cout<<0<<endl;
    }
    else if(arr[1][2]==1 || arr[2][1]==1 || arr[2][3]==1 || arr[3][2]==1){
    cout<<1<<endl;
    }
    else if(arr[0][4]==1 || arr[0][0]==1 || arr[4][0]==1 || arr[4][4]==1){
    cout<<4<<endl;
    }
    else if(arr[0][1]==1 || arr[1][0]==1 || arr[0][3]==1 || arr[3][0]==1 || arr[4][1]==1 || arr[1][4]==1 || arr[3][4]==1 || arr[4][3]==1){
    cout<<3<<endl;
    }
    else{
        cout<<2<<endl;
    }
    return 0;
}
