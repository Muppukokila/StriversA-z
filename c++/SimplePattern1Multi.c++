#include <iostream>
using namespace std;

//Pattern for mutiple times if you give t=2 you can print pattern 2 times with numbers star patterns
/*  for n=4
    ****
    ****
    ****
    **** 
    for n=3
    
    ****
    ****
    ****
    */
void print1(int n){
    for(int i=0;i<n;i++){
        for(int i=0;i<n;i++){
            cout<<"*";
        }
       cout<<endl; 
    }
}
int main() {
    //runs for multiple times
    int t;
    cin>>t;
    for(int i=0;i<t;i++){
   int n;
   cin>>n;
   print1(n);
    }
    return 0;
}