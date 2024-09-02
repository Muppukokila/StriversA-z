#include <iostream>
using namespace std;
/*
Problem statement
Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Diamond.

Example:
Input: ‘N’ = 3

Output: 

  *
 ***
*****
*****
 ***
  *
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1  <= N <= 20
Time Limit: 1 sec
Sample Input 1:
3
Sample Output 1:
  *
 ***
*****
*****
 ***
  *    
Sample Input 2 :
1
Sample Output 2 :
*
*
*/
void print9(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++)
        cout<<" ";
        for(int j=0;j<2*i+1;j++)
        cout<<"*";
        for(int j=0;j<n-i-1;j++)
        cout<<" ";
        cout<<endl;
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<i;j++)
        cout<<" ";
        for(int j=0;j<2*n-(2*i+1);j++)
        cout<<"*";
        for(int j=0;j<i;j++)
        cout<<" ";
        cout<<endl;
    }
}
int main() {
    int n;
    cin>>n;
    print9(n);
    

    return 0;
}