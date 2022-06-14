public class Reduce_n_to_1 {


    public int helper(int n){

        int res = 0;

        while( n != 1){
            if (n % 2 == 0){
                n = n/2;
            }else if(n == 3){
                n = n - 1;
            }
            else if (n % 4 == 1){
                n = n-1;
            }
            else if (n % 4 == 3){
                n = n+1;
            }
            res++;
        }

        return res;
    }

    public static void main(String[] args) {

        Reduce_n_to_1 r = new Reduce_n_to_1();
        System.out.println(r.helper(3));

    }



}
