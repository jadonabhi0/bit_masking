public class No_of_triplets {

    public static void helper(int [] array){

        int c = 0;

        for (int i = 0 ; i < array.length ; i++){
            int xor = array[i];

            for (int k = i + 1 ; k < array.length ; k++){
                xor ^= array[k];

                if (xor == 0){
                    c += (k-i);
                }
            }

        }

        System.out.print(c);

    }

    public static void main(String[] args) {

        int[] array = {1,3,2,5,7,2,7,5,6,4};
        helper(array);


    }


}
