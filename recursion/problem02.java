//WRITE A PROGRAM TO PRINT 1 TO N USING RECURSION
import java.util.Scanner;
public class problem02 {
    static void hello(int i,int n){
        if (i>n){
            return;
        }
        System.out.println(i);
        hello(i+1,n);

    }
    public static void main(String[] args){
        Scanner hey = new Scanner(System.in);
        int n = hey.nextInt();

        hello(1,n);

    }
}
