#include <iostream>

using namespace std;

int main()
{
    int T;
    cin>>T;
    for(int i=1;i<=T;i++){
    long a,b,c,d,e,f,g,h,counter=0;
    char x,y,z;
    cin>>a>>x>>b>>y>>c>>z>>d;
    cin>>e>>x>>f>>y>>g>>z>>h;
    long arr[4],barr[4];
    barr[0]=a;
    barr[1]=b;
    barr[2]=c;
    barr[3]=d;
    arr[0]=e;
    arr[1]=f;
    arr[2]=g;
    arr[3]=h;
    for(int carry=0;carry<4;carry++){
       long bin,dec=0,rem,num,base=1;
       num=arr[carry];
       bin=arr[carry];
       while(num>0){
        rem=num%10;
        dec=dec+rem*base;
        base=base*2;
        num=num/10;
       }
       if(dec==barr[carry]){
        counter++;
       }
    }
    if(counter==4){cout<<"Case "<<i<<": "<<"Yes"<<endl;}
    else{
        cout<<"Case "<<i<<": "<<"No"<<endl;
    }
    }
    return 0;
}
