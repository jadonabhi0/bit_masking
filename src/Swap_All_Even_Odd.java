public class Swap_All_Even_Odd {

    public static void helper(int n){

        int em = 0xAAAAAAAA; //-->1010101010101010101010101010
        int om = 0x55555555; //--> 1010101010101010101010101010

        int even = (n & em);
        int odd = (n & om);

        even <<= 1;
        odd >>=1;

        int o = even | odd;

        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(o));

    }

    public static void main(String[] args) {

        helper(109);

    }

}
