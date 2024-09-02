import java.util.*;

class HelloWorld {
    static void Print1(int N) {
        if (N == 0)
            return;
        System.out.print(N + " ");
        Print1(N - 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        Print1(N);
    }
}