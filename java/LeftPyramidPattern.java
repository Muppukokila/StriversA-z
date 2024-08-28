import java.util.*;
/*
   print the pattern for n=3
   *   i=0 j=0
   **  i=1  j=0,1
   ***  i=2 j=0,1,2
   
 */

class HelloWorld {
    static void print1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
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
