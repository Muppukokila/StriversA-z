import java.util.Scanner;

public class Main {
    public static boolean isPalindrome(int x) {
        int dup = x;

        int reversedHalf = 0;
        while (x > 0) {
            int last = x % 10;
            reversedHalf = reversedHalf + (last * last * last); // Get the last digit and add it to reversedHalf
            x /= 10; // Remove the last digit from x
        }
        return dup == reversedHalf;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isPalindrome(n));
        scanner.close();
    }
}
