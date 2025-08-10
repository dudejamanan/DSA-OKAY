//WRITE A PROGRAM TO PRINT N TO 1 USING RECURSION
import java.util.Scanner;
public class problem03 {
    static void hello(int a , int b){
        if (a<1){
            return;
        }
        System.out.println(a);
        hello(a-1,a);

    }
    public static void main(String[] args){
        Scanner hey = new Scanner(System.in);
        int n = hey.nextInt();
        hello(n,n);
    }


}
