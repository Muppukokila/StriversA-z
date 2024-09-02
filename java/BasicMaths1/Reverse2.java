import java.util.*;

class HelloWorld {
    static int Reverse(int n) {
        int rev = 0;
        while (n > 0) {
            int last = n % 10;
            rev = (rev * 10) + last;
            n = n / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(Reverse(n));
    }
}
