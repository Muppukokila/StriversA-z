import java.util.*;

//Time complexity = O(log10(N))--->dividing
class Main {
    static int CountDigit(int n) {

        // while (n > 0) {
        // count += 1;
        // n = n / 10
        int count = (int) (Math.log10(n) + 1);

        return count;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print(CountDigit(n));
    }
}
