public class Flip_Bits_A_to_B {

    public static int helper(int a, int b){
        int count = 0;

        int xor = a ^ b;

        while( xor != 0){
            int rmsb = xor & -xor;
            xor -= rmsb;
            count++;
        }
        return count;
    }



    public static void main(String[] args) {

        int a = 20000;
        int b = 3;

        System.out.println(Integer.toBinaryString(a^b));
        System.out.println(helper(a,b));


    }



}
