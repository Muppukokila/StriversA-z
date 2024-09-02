import java.util.*;

class HelloWorld {
    static void PrintN(int n) {
        if (n == 0)
            return; // Base Condition
        PrintN(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        PrintN(n);
    }
}
