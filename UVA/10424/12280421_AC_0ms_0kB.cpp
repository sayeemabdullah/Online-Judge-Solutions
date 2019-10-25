#include <bits/stdc++.h>
using namespace std;

int main()
{
    string S,F;
    int number1,number2;
    while(getline(cin,S))
    {
        getline(cin,F);
        number1=0;
        number2=0;
        for(int i=0; i<S.length(); i++)
        {
            if(islower(S[i])){
                number1+=S[i]-'a'+1;
            }
            else if(isupper(S[i])){
                number1+=S[i]-'A'+1;
            }
        }
        if(number1%9==0){
            number1=9;
        }
        else{
            number1=number1%9;
        }
        for(int i=0; i<F.length(); i++)
        {
            if(islower(F[i])){
                number2+=F[i]-'a'+1;
            }
            else if(isupper(F[i])){
                number2+=F[i]-'A'+1;
        }
        }
        if(number2%9==0){
            number2=9;}
        else{
            number2=number2%9;
        }
        if(number1>=number2){
            printf("%.2lf %%\n",number2*100.0/number1);
        }
        else{
            printf("%.2lf %%\n",number1*100.0/number2);
    }
}
}
