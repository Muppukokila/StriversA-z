#include <iostream>
using namespace std;
 /*
   print the pattern for n=3
   1 2 3       i=1  j=1
   1 2         i=2  j=1,2
   1          i=3  j=1,2,3
   
 */
 
 /*  
Aryan and his friends are very fond of the pattern. For a given integer ‘N’, they want to make the Reverse N-Number Triangle.

Example:
Input: ‘N’ = 3

Output: 

1 2 3
1 2
1
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1  <= N <= 20
Time Limit: 1 sec
Sample Input 1:
3
Sample Output 1:
1 2 3
1 2
1
Sample Input 2 :
4
Sample Output 2 :
1 2 3 4
1 2 3
1 2
1
Sample Input 3 :
7
Sample Output 3 :
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5 
1 2 3 4
1 2 3
1 2
1 */
 
void print2(int n){
   for(int i=n;i>=1;i--){
		for(int j=1;j<=i;j++){
			cout<<j<<" ";
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