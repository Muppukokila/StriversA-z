#include<bits/stdc++.h>
using namespace std;
int Reverse(int n){
    int rev=0;
    while(n>0){
        int last=n%10;
        rev=(rev*10)+last;
        n=n/10;
    }
    return rev;
}
int main() {
    // Write C++ code here
    int n;
    cin>>n;
    cout<<Reverse(n);

    return 0;
}