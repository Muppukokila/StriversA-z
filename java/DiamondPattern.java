import java.util.*;

/*
Problem statement
Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Diamond.

Example:
Input: N = 3

Output: 

  *
 ***
*****
*****
 ***
  *
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1  <= N <= 20
Time Limit: 1 sec
Sample Input 1:
3
Sample Output 1:
  *
 ***
*****
*****
 ***
  *    
Sample Input 2 :
1
Sample Output 2 :
*
*
*/
class HelloWorld {
    static void print9(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++)
                System.out.print(" ");
            for (int j = 0; j < 2 * i + 1; j++)
                System.out.print("*");
            for (int j = 0; j < n - i - 1; j++)
                System.out.print(" ");
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++)
                System.out.print(" ");
            for (int j = 0; j < 2 * n - (2 * i + 1); j++)
                System.out.print("*");
            for (int j = 0; j < i; j++)
                System.out.print(" ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        print9(n);
    }
}