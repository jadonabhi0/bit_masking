package minssing_and_find;

public class All_repeating_except_two {


    public static void helper(int[] array){

        int xor = 0;
        for(int  val : array){
            xor = xor ^ val;
        }

        int rsbm = xor & -xor;

        int x = 0;
        int y = 0 ;

        for (int val : array){
            if((rsbm & val) == 0){
                x = x ^ val;
            }else{
                y = y ^ val;
            }
        }
        System.out.println(x);
        System.out.println(y);
    }


    public static void main(String[] args) {
        int[] array = {1,2,3,4,1,2,3,4,5,6};
        helper(array);
    }

}
