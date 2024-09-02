import java.util.*;

class HelloWorld {
    static void Division(int n) {
        ArrayList<Integer> ls = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                ls.add(i);
                if (n / i != i) {
                    ls.add(n / i);
                }
            }
        }
        Collections.sort(ls);
        for (int it : ls)
            System.out.print(it + " ");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Division(n);
    }
}
