public class Is_Pow_of_2 {

    public static boolean helper(int n){
        int t = n-1;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(t));
        if ((t & n) == 0){
            return true;
        }else {
            return false;
        }
    }


    public static void main(String[] args) {

        System.out.println(helper(1));


    }


}
