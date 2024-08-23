#include<bits/stdc++.h>
using namespace std;

//pass by value
/* A variable actual value is copied and then passed to function of the orginal value. As a result any changes to the parameter inside the function will not affect the variable's original value,outside the function */
void doSomething(int num){
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
10   */