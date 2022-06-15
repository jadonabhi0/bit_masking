public class Reverse_bits {

    public static void helper(int n){

        boolean flag  = false;
        int rev = 0;
        int j = 0;

        for (int i = 31 ; i >= 0 ; i--){

            if (flag){
                if (((1 << i) & n) != 0){
                    System.out.print(1);
                    rev = rev | (1 << j);
                    j++;
                }else{
                    System.out.print(0);
                    j++;
                }
            }else {
                if (((1 << i) & n) != 0){
                    flag = true;
                    System.out.print(1);

                    rev = rev | (1 << j);
                    j++;
                }
            }



        }
        System.out.println();
        System.out.println(Integer.toBinaryString(rev));

    }

    public static void main(String[] args) {
        helper(155);
    }
}
