import java.util.*;

//pass by reference
/* a variable is passed as a reference to a function. The address of the variable is stored in a pointer varibale inside the function.Hence the variable inside the function is an alias for the passed variable  */

class Main {
   static void doSomething(int &num){
        System.out.println(num);
        num+=5;
        System.out.println(num);
        num+=5;
        System.out.println(num);
    }

    public static void main(String[] args) {
        int num = 10;
        doSomething(num);
        System.out.println(num);
    }
}

/*
 * output:-
 * 10
 * 15
 * 20
 * 20
 */
