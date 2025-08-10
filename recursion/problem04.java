//WRITE A PROGRAM TO PRINT 1 TO N USING RECURSION AND BACKTRACKING (YOU CAN NOT USE ADDTION)
// you can not use f(i+1,n)
import java.util.Scanner;
public class problem04 {
    static void hello(int i , int n){
        if (i<0) {
            return;
        }
        hello(i-1,n);
        System.out.println(i);
    }
    public static void main(String[] args){
        Scanner hello = new Scanner(System.in);
        int n = hello.nextInt();
        hello(n,n);
    }
}
