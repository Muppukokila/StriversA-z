//return functions
import java.util.*;
class Main{
    static int sum(int num1,int num2){
        int res=num1+num2;
        return res;
    }
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        int res=sum(n1,n2);
        System.out.println(res);
    }
}