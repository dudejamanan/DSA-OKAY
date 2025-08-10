public class recursion01  {


    static void hello(int count){

        if (count == 3){
            return;
        }
        
        System.out.println(count);
        hello(count+1);
    }
    public static void main(String [] args ){



        hello(0);

    }
}
