#include <bits/stdc++.h>
using namespace std;
void Divisiors(int n){
    vector<int>ls;
    for(int i=1;i<=sqrt(n);i++){
        if(n%i==0){
        ls.push_back(i);
        if(n/i!=i)
        ls.push_back(n/i);}
    }
     sort(ls.begin(),ls.end());
     for(auto it:ls)
     cout<<it<<" ";
    }
int main() {
    // Write C++ code here
    int n;
    cin>>n;
    Divisiors(n);

    return 0;
}