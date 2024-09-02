#include <bits/stdc++.h>
using namespace std;
void PrintNo(int n){
    if(n==0)return;  //Base Condition
    PrintNo(n-1);
    cout<<n<<" ";
}
int main() {
    // Write C++ code here
    int n;
    cin>>n;
    PrintNo(n);

    return 0;
}