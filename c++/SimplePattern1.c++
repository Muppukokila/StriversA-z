#include <iostream>
using namespace std;

//Pattern for n=4
/*  ****
    ****
    ****
    ****  */
void print1(int n){
    for(int i=0;i<n;i++){
        for(int i=0;i<n;i++){
            cout<<"*";
        }
       cout<<endl; 
    }
}
int main() {
   int n;
   cin>>n;
   print1(n);

    return 0;
}