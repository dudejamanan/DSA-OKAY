//WRITE A PROGRAM FOR SUM OF FIRST N NUMBERS (PARAMETERISED WAY)
import java.util.Scanner;
public class Problem05 {
    static void hello(int n, int sum){
        if (n<0){
            return;
        }
        System.out.println(sum);
        hello(n-1,sum+n);


    }
    public static void main(String[] args){
        Scanner hey = new Scanner(System.in);
        int n = hey.nextInt();
        hello(n,0);

    }
}
