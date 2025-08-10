/* pattern3
 1
 1 2
 1 2 3
 1 2 3 4
 */

package patterns;
import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args) {
            Scanner hello = new Scanner(System.in);
            int a = hello.nextInt();
            for (int i =0 ; i <= a ; i++ ){
                for (int j = 1 ; j <=i ; j++){
                    System.out.print(j+ " ");

                }
                System.out.println();
            }

    }
}
