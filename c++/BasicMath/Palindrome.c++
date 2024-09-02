#include<bits/stdc++.h>
using namespace std;
 bool isPalindrome(int x) {
       if (x < 0 || (x % 10 == 0 && x != 0)) {
        return false;
    }
    
    int reversedHalf = 0;
    while (x > reversedHalf) {
        reversedHalf = reversedHalf * 10 + x % 10; // Get the last digit and add it to reversedHalf
        x /= 10; // Remove the last digit from x
    }
    return x == reversedHalf || x == reversedHalf / 10;
    }
int main() {
    // Write C++ code here
    int n;
    cin>>n;
    cout<<isPalindrome(n);

    return 0;
}