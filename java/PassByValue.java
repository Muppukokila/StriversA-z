import java.util.*;
//pass by value
/* A variable actual value is copied and then passed to function of the orginal value. As a result any changes to the parameter inside the function will not affect the variable's original value,outside the function */

class Main{
   static void doSomething(int num){
        System.out.println(num);
        num+=5;
        System.out.println(num);
        num+=5;
        System.out.println(num);
    }
    public static void main(String [] args){
        int num=10;
        doSomething(num);
        System.out.println(num);
    }
}

/* output:-
10
15
20
10   */