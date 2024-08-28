import java.util.*;
//Pattern for mutiple times if you give t=2 you can print pattern 2 times with numbers star patterns
/*  for n=4
    ****
    ****
    ****
    **** 
    for n=3
    
    ****
    ****
    ****
    */

class HelloWorld {
    static void print1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {

            int n = s.nextInt();
            print1(n);
        }
    }
}
