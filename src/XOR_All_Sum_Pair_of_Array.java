public class XOR_All_Sum_Pair_of_Array {

    public int helper(int[] array){

        int xor = 0;

        for(int i : array){
            xor ^= 2*i;
        }
        return xor;
    }

    public static void main(String[] args) {

        XOR_All_Sum_Pair_of_Array x = new XOR_All_Sum_Pair_of_Array();
        System.out.println(x.helper(new int[]{1, 2, 3, 4}));

    }
}
