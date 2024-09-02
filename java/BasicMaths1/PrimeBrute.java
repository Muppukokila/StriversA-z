import java.util.*;

class Main {
    static void Prime(int n) {
        int cnt = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                cnt++;
                if (n / i != i)
                    cnt++;

            }
        }
        if (cnt == 2)
            System.out.print("Prime");
        else
            System.out.print("Not a Prime");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Prime(n);
    }
}
