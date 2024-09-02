#include<bits/stdc++.h>
using namespace std;
void Names(String name){
    int cnt=0;
    if(cnt==5)
    return;
     cnt++;
     cout<<name;
     Names(name);

}
int main(){
    String name;
    cin>>name;
    Names(name);
}