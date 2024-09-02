#include <bits/stdc++.h>
using namespace std;
void Divisiors(int n){
    vector<int>ls;
    int count=0;
    for(int i=1;i<=sqrt(n);i++){
        if(n%i==0){
        count++;
        if(n/i!=i)
        count++;}
    }
     if(count==2)
     cout<<"Prime Number";
     else
     cout<<"not Prime Number";
    }
int main() {
    // Write C++ code here
    int n;
    cin>>n;
    Divisiors(n);

    return 0;
}