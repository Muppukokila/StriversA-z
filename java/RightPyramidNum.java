import java.util.*;
/*
print the pattern for n=3
1       i=1  j=1
1 2     i=2  j=1,2
1 2 3   i=3  j=1,2,3

*/

/* Sam is making a Triangular painting for a maths project.

An N-dimensional Triangle is represented by the lower triangle of the pattern filled with integers starting from 1.

For every value of ‘N’, help sam to print the corresponding N-dimensional Triangle.

Example:
Input: N = 3

Output: 
1
1 2 
1 2 3
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1  <= N <= 25
Time Limit: 1 sec
Sample Input 1:
3
Sample Output 1:
1
1 2 
1 2 3
Sample Input 2 :
1
Sample Output 2 :
1
*/

class HelloWorld {
    static void print1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
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
