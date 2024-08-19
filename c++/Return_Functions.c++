//return function
#include<bits/stdc++.h>
using namespace std;
int sum(int num1,int num2){
    int res=num1+num2;
    return res;
}
int main(){
    int n1,n2;
    cin>>n1>>n2;
    int res=sum(n1,n2);
    cout<<res;
    return 0;
}