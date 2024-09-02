import java.util.*;

class HelloWorld {
    static void Division(int n) {
        int count = 0;
        ArrayList<Integer> ls = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
                if (n / i != i) {
                    count++;
                }
            }
        }

        if (count == 2)
            System.out.print("Prime Number");
        else
            System.out.print("Not Prime Number");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Division(n);
    }
}