public class Sum_of_bit_difference {
     public  static void helper(int[] array){

         long res = 0;

         for (int i = 0 ; i < 32 ; i++){
             long counton = 0;

             for (int val : array){
                if ((val & (1 << i)) != 0)   {
                    counton++;
                }
             }
             long countoff = array.length - counton;
             long diff = countoff * counton * 2;

             res += diff;
         }

         System.out.println(res);
     }


    public static void main(String[] args) {
         int[] arary = {1,2,3,4,5,6};
         helper(arary);

    }

}
