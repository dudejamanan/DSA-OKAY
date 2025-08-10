import java.util.*;
public class hashing01 {
    public static void main(String[] args){
        Scanner hello = new Scanner(System.in);
        int no_arr = hello.nextInt(); //number of elements to be added in the array
        int [] arr = new int [no_arr]; //creation of array
        for(int i=0;i<no_arr;i++){ // creating a loop for adding the elements in the array
            arr[i]= hello.nextInt();

        }
        int [] hash  = new int[13]; //declares an hash array of length 13 (each index in this array will be used to store the frequency of a number)
        for (int i = 0; i<no_arr;i++){ //a loop runs through all the elements of the arr array
            hash[arr[i]]+=1; //takes the value of arr[i] as an index of hash array (it keeps the count of how many times the element appeared in the arr appeared)


        }
        int number = hello.nextInt();
        System.out.println(hash[number]);



    }



}
