public class Copy_Set_Bits_In_Range {

    public static void helper(int left , int right, int a, int b){

        int mask = (1 << (right-left+1));
        mask = mask-1;
        mask = (mask << (left-1));
        mask = mask & a;
        mask = mask | b;
        System.out.println(mask);
        System.out.println(b);

    }


    public static void main(String[] args) {

        helper(4,10,80000,40000);

    }


}
