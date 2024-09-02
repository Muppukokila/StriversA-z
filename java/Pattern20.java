import java.util.Scanner;

/*
*                 * 
* *             * * 
* * *         * * * 
* * * *     * * * * 
* * * * * * * * * * 
* * * *     * * * * 
* * *         * * * 
* *             * * 
*                 * 
*/
public class Main {

    public static void print19(int n) {
        int space = 2 * n - 2;
        for (int i = 1; i <= 2 * n - 1; i++) {
            int star = i;
            if (i > n)
                star = 2 * n - i;
            // stars
            for (int j = 1; j <= star; j++)
                System.out.print("* ");
            // space
            for (int j = 1; j <= space; j++)
                System.out.print("  ");
            // stars
            for (int j = 1; j <= star; j++)
                System.out.print("* ");
            System.out.println();
            if (i < n)
                space -= 2;
            else
                space += 2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        print19(n);
        scanner.close();
    }
}
