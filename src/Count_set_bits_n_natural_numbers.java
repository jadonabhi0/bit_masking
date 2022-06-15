public class Count_set_bits_n_natural_numbers {

    public static int helper(int n){

        if (n == 0){
            return 0;
        }

        int x = maxPowof2(n);
        int bitsraiseupto2 = x * (1 << (x-1));
        int msbfrom2raiseton = n - (1 << x) + 1;
        int rest = n - (1 << x);
        int ans = bitsraiseupto2 + msbfrom2raiseton + helper(rest);
        return ans ;

    }


    public static int maxPowof2(int n){
        int x = 0;
        while((1 << x) <= n){
            x++;
        }
        return x-1;
    }


    public static void main(String[] args) {

        System.out.println(helper(15));

    }
}
