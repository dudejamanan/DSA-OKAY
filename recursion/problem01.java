//WRITE A PROGRAM TO PRINT AN INPUT N TIMES USING RECURSION
import java.util.Scanner;

public class problem01 {

    static void hello(int i,String ok, int n) {
        if (i>n){
            return;

        }

        System.out.println(ok);


        hello(i+1,ok,n);



    }
    public static void main(String[] args){
        Scanner hey = new Scanner(System.in);
        String ok = hey.next();

        int n = hey.nextInt();

        hello(1,ok,n);



    }
}
