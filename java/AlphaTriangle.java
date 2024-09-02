import java.util.*;

class HelloWorld {
    static void print17(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (char ch = (char) ('E' - i); ch <= 'E'; ch++)
                System.out.print(ch + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        print17(n);

    }
}
