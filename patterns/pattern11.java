/* pattern11
 1
 01
 101
 0101
 10101
 */
package patterns;
import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        Scanner hello = new Scanner(System.in);
        int a = hello.nextInt();
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j < i; j++) {
                if (i%2==0) {
                    if (j % 2 == 0) {
                        System.out.print(0);
                    } else {
                        System.out.print(1);
                    }
                }
                else{
                    if (j%2==0){
                        System.out.print(1);
                    }
                    else{
                        System.out.print(0);
                    }
                }


            }
            System.out.println();
        }
    }
}