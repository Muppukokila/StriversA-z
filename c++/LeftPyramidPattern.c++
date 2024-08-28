#include <iostream>
using namespace std;
/*
   print the pattern for n=3
   *   i=0 j=0
   **  i=1  j=0,1
   ***  i=2 j=0,1,2
   
 */
void print2(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            cout<<"*";
        }
        cout<<endl;
    }
}
int main() {
    int t;
    cin>>t;
    for(int i=0;i<t;i++){
        int n;
        cin>>n;
        print2(n);
    }

    return 0;
}