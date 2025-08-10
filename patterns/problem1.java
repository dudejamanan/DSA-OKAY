package patterns;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;
public class problem1 {

    public static void main(String[] args) {
        int i = 1;
        while (i>0){
            Scanner hello = new Scanner(System.in);
            String a = hello.nextLine();



            System.out.print(i+ " "+ a);
            System.out.println();
            i+=1;
        }
    }
}