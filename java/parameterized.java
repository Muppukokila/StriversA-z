
//function
//void && parameterised function
import java.util.*;

class Main {
    static void printName(String name) {
        System.out.print("hey " + name);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.next();
        printName(name);

    }
}
