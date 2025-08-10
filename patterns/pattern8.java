/* pattern8
 *********
  *******
   *****
    ***
     *

 */

package patterns;
import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {


        Scanner hello = new Scanner(System.in);
        int a = hello.nextInt();
        for (int i = 0; i < a; i++) {
                for (int j = 0 ; j<i ; j++ ){
                    System.out.print(" ");

                }
                for (int j = 0 ; j < (2*(a-i)-1) ; j++){
                System.out.print("*");

            }
            for (int j = 0 ; j <i ; j++){
                System.out.print(" ");
            }
            System.out.println();



            }


        }
    }

