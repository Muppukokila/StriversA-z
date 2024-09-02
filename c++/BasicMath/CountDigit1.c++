#include<bits/stdc++.h>
using namespace std;
//Time complexity = O(log10(N))--->dividing
int CountDigits(int N){
    // int count=0;
    // while(N>0){
    //     count+=1;
    //     N=N/10;
    
    int count=(int)(log10(N)+1);
    return count;
    }
    

int main(){
    int N;
    cin>>N;
    int n=CountDigits(N);
    cout<<n;
}