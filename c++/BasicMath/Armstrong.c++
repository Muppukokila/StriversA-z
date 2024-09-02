#include<bits/stdc++.h>
using namespace std;
 bool isPalindrome(int x) {
     int dup=x;
     
    
    int reversedHalf = 0;
    while (x>0) {
        int last=x%10;
        reversedHalf = reversedHalf  + (last*last*last); // Get the last digit and add it to reversedHalf
        x /= 10; // Remove the last digit from x
    }
    return dup == reversedHalf;
    }
int main() {
    // Write C++ code here
    int n;
    cin>>n;
    cout<<isPalindrome(n);

    return 0;
}