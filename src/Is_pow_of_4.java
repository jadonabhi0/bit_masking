public class Is_pow_of_4 {

    public static boolean helper(int n){
        int mask = 0b01010101010101010101010101010101;
        return n > 0 && (n & (n-1)) == 0 && (mask & n) > 0;
    }



    public static void main(String[] args) {
        System.out.println(helper(1024));
    }


}
