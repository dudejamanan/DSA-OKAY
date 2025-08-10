/* pattern5
 1
 2 2
 3 3 3
 4 4 4 4
 5 5 5 5 5
 */



package patterns;
import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {


        Scanner hello = new Scanner(System.in);
        int a = hello.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = a ; j > i ; j--){
                System.out.print("*"+" ");
            }
            System.out.println();

        }
    }
}
