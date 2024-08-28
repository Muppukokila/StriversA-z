import java.util.*;
//Pattern for n=4
/*  ****
    ****
    ****
    ****  */

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
        int n = s.nextInt();
        print1(n);
    }
}
