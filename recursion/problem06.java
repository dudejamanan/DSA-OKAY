//WRITE A PROGRAM FOR SUM OF FIRST N NUMBERS (FUNCTIONAL WAY)
import java.util.Scanner;
public class problem06 {
    static int hello(int n){
        if (n==0){
            return 0;
        }
        return n+ hello(n-1);
    }
    public static void main(String[] args){
        Scanner hey = new Scanner(System.in);
        int n = hey.nextInt();
        System.out.println(hello(n));
    }

}
