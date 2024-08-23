#include<bits/stdc++.h>
using namespace std;

//pass by reference
/* a variable is passed as a reference to a function. The address of the variable is stored in a pointer varibale inside the function.Hence the variable inside the function is an alias for the passed variable  */
void doSomething(int &num){
  cout<<num<<endl;
  num+=5;
  cout<<num<<endl;
  num+=5;
  cout<<num<<endl;
}
int main(){
    int num=10;
    doSomething(num);
    cout<<num;
    return 0;
}

/* output:-
10
15
20
20   */