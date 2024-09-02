import java.util.Scanner;

public class Main {
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10; // Get the last digit and add it to reversedHalf
            x /= 10; // Remove the last digit from x
        }
        return x == reversedHalf || x == reversedHalf / 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isPalindrome(n));
        scanner.close();
    }
}
