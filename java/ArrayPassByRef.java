import java.util.*;

//generally array is passed by reference only so change in function cause change out side the function also
class Main {
    static void doSomething(int arr[], int n) {
        arr[0] += 100;
        System.out.println("value inside function" + arr[0]);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 5;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        doSomething(arr, n);
        System.out.print("value inside main " + arr[0]);
    }
}