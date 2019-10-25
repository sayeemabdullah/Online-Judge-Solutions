#include <bits/stdc++.h>

using namespace std;



int main()
{
    int T;
    cin>>T;
    for(int i=1;i<=T;i++){
    cout<<"Case "<<i<<":"<<endl;
    int t,command,size;
    deque<int>s;
    cin>>size>>t;
    for(int j=0;j<t;j++){
    string c;
    cin>>c;
    if(c=="pushLeft"){
        cin>>command;
        if(s.size() == size){
            cout<<"The queue is full"<<endl;
        }
        else{
            s.push_front(command);
            cout<<"Pushed in left: "<<command<<endl;
        }
    }
    else if(c=="pushRight"){
        cin>>command;
        if(s.size() == size){
            cout<<"The queue is full"<<endl;
        }
        else{
            s.push_back(command);
            cout<<"Pushed in right: "<<command<<endl;
        }
    }
    else if(c=="popLeft"){
        if(s.size() == 0){
            cout<<"The queue is empty"<<endl;
        }
        else{
            cout<<"Popped from left: "<<s.front()<<endl;
            s.pop_front();
            //s.erase(s.begin());
        }
    }
    else if(c=="popRight"){
        if(s.size() == 0){
            cout<<"The queue is empty"<<endl;
        }
        else{
            cout<<"Popped from right: "<<s.back()<<endl;
            s.pop_back();
            //s.erase(s.end());
        }
    }
    }
    }
    return 0;
}
