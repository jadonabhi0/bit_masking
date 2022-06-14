package minssing_and_find;

import java.util.Arrays;

public class One_Missing_One_Repeating {

    public static void helper(int [] array){
//         1 to n number
//        array = [1,2,3,4,5,2,7]  > 2 is repeated and 6 is missing

        int xor = 0;

        for (int i = 0 ; i < array.length ; i++){
            xor ^= array[i];
        }

        for (int i = 1 ; i <= array.length ; i++){
            xor ^= i;
        }

        int rmsb = xor & -xor;

        int x = 0;
        int y = 0;

        for (int val : array){
            if ((val & rmsb) == 0){
                x = x ^ val;
            }else{
                y = y ^ val;
            }
        }

        for (int val = 1 ; val <= array.length ; val++){
            if ((val & rmsb) == 0){
                x = x ^ val;
            }else{
                y = y ^ val;
            }
        }

    if (Arrays.asList(array).contains(x)){
        System.out.println(x + " is duplicate ");
        System.out.println(y + " is missing ");
    }else {
        System.out.println(y + " is duplicate ");
        System.out.println(x + " is missing ");
    }


    }


    public static void main(String[] args) {

        int[] array = {1,2,3,2,5,6,7};
        helper(array);
    }

}
