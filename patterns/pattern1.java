/* pattern1
 * * * *
 * * * *
 * * * *
 * * * *
 */

package patterns;
import java.util.Scanner;

public class pattern1 {

    public static void main(String [] args){
        Scanner hello = new Scanner(System.in);
        int b = hello.nextInt();
        int a = hello.nextInt();
        for (int c = 0 ; c<b ; c++) {
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {
                    System.out.print("*");
                    System.out.print(" ");
                }
                System.out.println();

            }
            a = hello.nextInt();

        }

    }
}