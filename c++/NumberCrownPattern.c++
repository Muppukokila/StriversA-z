#include <iostream>
using namespace std;
/*
Aryan and his friends are very fond of the pattern. They want to make the Reverse N-Number Crown for a given integer' N'.

Given 'N', print the corresponding pattern.

Example:
Input: ‘N’ = 3

Output: 

1         1
1 2     2 1
1 2 3 3 2 1
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1  <= N <= 20
Time Limit: 1 sec
Sample Input 1:
3
Sample Output 1:
1         1
1 2     2 1
1 2 3 3 2 1
Sample Input 2 :
4
Sample Output 2 :
1             1
1 2         2 1
1 2 3     3 2 1
1 2 3 4 4 3 2 1
Sample Input 3 :
7
Sample Output 3 :
1                         1
1 2                     2 1
1 2 3                 3 2 1
1 2 3 4             4 3 2 1
1 2 3 4 5         5 4 3 2 1
1 2 3 4 5 6     6 5 4 3 2 1
1 2 3 4 5 6 7 7 6 5 4 3 2 1
*/
void print12(int n){
    int space=2*(n-1);
    for(int i=1;i<=n;i++){
        //numbers
        //int space=2*(n-1);
        for(int j=1;j<=i;j++)
        cout<<j<<" ";
        //space
        for(int j=1;j<=space;j++)
        cout<<" "<<" ";
        //numbers
        for(int j=i;j>=1;j--)
        cout<<j<<" ";
        cout<<endl;
       space-=2;
    }
}
int main() {
    int n;
    cin>>n;
    print12(n);

    return 0;
}