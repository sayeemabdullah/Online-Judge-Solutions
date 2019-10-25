#include <bits/stdc++.h>
using namespace std;
const int N=1e5+5;

int a[N];



bool palindrome(long long num){
    int k=0;

    while(num!=0)
    {
        a[k++]=num%10;
        num=num/10;
    }
    for(int l=0;l<k-1-l;++l)
    {
        if(a[l]!=a[k-1-l])
            return false;
    }
    return true;
}

long long reverss(long long num)
{
    long long int rev_num=0;
    while(num!=0)
	{
      rev_num=rev_num*10+num%10;
      num=num/10;
	}
	return rev_num;
}



int main()
{
    int t,i;
    long long num;
    cin>>t;
    while(t--)
    {
        cin>>num;
        i=0;
        while(!(palindrome(num))){
            num+=reverss(num);
            i++;
        }
        printf("%d %lld\n",i,num);
    }
    return 0;
}
