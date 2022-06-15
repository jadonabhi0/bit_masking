public class Max_prod_word_length {

    public static int helper(String[] array){
        int len = array.length;
        int[] values = new int[len];

        for (int i = 0 ; i < len ; i++){
            int mask = 0;

            for (int j = 0 ; j < array[i].length() ; j++){
                mask |= 1 << array[i].charAt(j)-'a';
            }

            values[i] = mask;
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0 ; i < values.length-1 ; i++){

            for (int j = i + 1 ; j < values.length ; j++){

                if ((values[i] & values[j]) == 0){
                    max = Math.max(max, array[i].length() * array[j].length() );
                }
            }
        }
        return  max;
    }


    public static void main(String[] args) {

        String[] array = {"a","ab","abc","d","cd","bcd","abcd"};

        System.out.println(helper(array));

    }


}
