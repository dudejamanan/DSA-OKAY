//WRITE A PROGRAM TO SWAP ELEMENTS OF AN ARRAY
import java.util.Scanner;
import java.util.Arrays;


public class problem08 {
    static void hello(int i, int r){
        int[] okay = {1,2,3,4,5};


        int temp=okay[i];
        okay[i]=okay[r];
        okay[r]=temp;
        hello(i+1,r-1);


    }
    public static void main(String[] args){

        System.out.println(hello(0,4));

    }
}
