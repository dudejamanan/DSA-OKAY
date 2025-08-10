/* pattern6
 1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/

package patterns;
import java.util.Scanner;
public class pattern6 {
    public static void main(String[] args) {
        Scanner hello = new Scanner(System.in);
        int a = hello.nextInt();
        for(int i = 0 ; i < a ; i++){
            for (int j = 1 ; j < a-i+1 ; j++){
                System.out.print(j+" ");


            }
            System.out.println();
        }
    }
}
