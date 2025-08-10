// WRITE A PROGRAM TO GIVE FACTORIAL OF A GIVEN NUMBER
import java.util.Scanner;
public class problem07 {
    static int hello (int n){
        if (n ==1){
            return 1;
        }
        return n*hello(n-1);

    }
    public static void main(String[] args){
        Scanner hey = new Scanner(System.in);
        int n = hey.nextInt();
        System.out.println(hello(n));

    }
}
