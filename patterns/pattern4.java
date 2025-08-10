/* pattern4
 1
 2 2
 3 3 3
 4 4 4 4
 5 5 5 5 5
 */

package patterns;
import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner hello = new Scanner(System.in);
        int a = hello.nextInt();
        for (int i = 0 ; i<=a ; i++){
            for (int j = 1 ; j<=i ; j++){
                System.out.print(i+ " ");

            }
            System.out.println();
        }

    }
}
