#include<bits/stdc++.h>
using namespace std;

int main(){

    int a,b;

    while(cin >> a >> b){
        if(a==0 && b==0){
            break;
        }

        int count = 0;
        for(int i=a;i<= b;i++){

            int number = sqrt(i);
            if(i == pow(number,2)){
            count++;}
        }
        cout << count << endl;
    }
    return 0;
}
