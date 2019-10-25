#include <bits/stdc++.h>

using namespace std;

int main()
{
    int T,salary;
    cin>>T;
    for(int i=1;i<=T;i++){
    cin>>salary;
    double H,D;
    if(salary<1500){
    H=0.1*salary;//+salary;
    D= ((0.9)*salary);//+salary;
    //G=G+H+D;
    printf("%.2f\n", (salary + D + H));
    //cout<<G<<endl;
    }
    else{
       H=500;
       D= (0.98*salary);//+salary;
       //G=G+H+D;
       printf("%.2f\n", (salary + D + H));
    //cout<<G<<endl;
    }
    }
    return 0;
}
