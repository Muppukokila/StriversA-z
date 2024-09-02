#include <iostream>
using namespace std;
/*
Aryan and his friends are very fond of patterns. For a given integer ‘N’, they want to make the Reverse Letter Triangle.

You must print a matrix corresponding to the given Reverse Letter Triangle.

Example:
Input: N = 3

Output: 

A B C
A B
A
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1  <= N <= 20
Time Limit: 1 sec
Sample Input 1:
3
Sample Output 1:
A B C
A B
A
Sample Input 2 :
4
Sample Output 2 :
A B C D
A B C
A B
A
Sample Input 3 :
7
Sample Output 3 :
A B C D E F G 
A B C D E F 
A B C D E 
A B C D 
A B C 
A B 
A 
*/
void print12(int n){
     for(int i=0;i<n;i++){
        for(char ch='A';ch<='A'+(n-i-1);ch++){
              cout<<ch<<" ";
              
        }
        cout<<endl;
    }
}
int main() {
    int n;
    cin>>n;
    print12(n);

    return 0;
}