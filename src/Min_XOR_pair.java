import java.util.Arrays;

public class Min_XOR_pair {

    public static int helper(int[] array){
        int xor = 0;
        int min = Integer.MAX_VALUE;
        Arrays.sort(array);
        for (int i = 0 ; i < array.length-1 ; i++){
            xor = array[i] ^ array[i+1];
            if (min > xor){
                min = xor;
            }
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] array = new int[]{
                1,7,9,4,2,5,7
        };

        System.out.println(helper(array));
    }
}
