#include<bits/stdc++.h>
#define le 1000001
#define m 1000000
using namespace std;
bool prime[le];
void sieve()
{
    //bool prime[1000000];
    memset(prime, true, sizeof(prime));
    prime[1] = false;

    for (int p=2; p*p<=m; p++)
    {
        if (prime[p] == true)
        {
            for (int i=p*p; i<=m; i += p)
                prime[i] = false;
        }
    }
}

bool isPrime(int n){

  for(int i = 2 ; i <= sqrt(n); i++){
    if(n % i == 0){
        return false;
    }
  }
  return true;
}

int main()
{
    sieve();
    int flag = 0,n;
    while(scanf("%d", &n) == 1 && n != 0)
    {
        for(int i = 3; i < n; i+=2)
        {
            if(prime[i] && prime[n-i])
            {
                printf("%d = %d + %d\n", n, i, n-i);
                flag = 1;
                break;
            }
        }

        if(flag == 0)
        {
            printf("Goldbach's conjecture is wrong.\n");
        }
    }
    return 0;
}
