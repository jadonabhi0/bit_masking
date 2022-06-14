public class String_div_by_3 {


    public static boolean helper(String s){

        int even = 0;
        int odd = 0;

        for (int i = 0 ; i < s.length() ; i++){
            int bit = s.charAt(i) - '0';

            if (i % 2 == 0){
                even += bit;
            }else{
                odd += bit;
            }
        }

        int delta = even - odd;


        if (delta % 11 == 0){
            return true;
        }
        else{
            return  false;
        }
    }


    public static void main(String[] args) {


        System.out.println(helper("1010111111111111111111"));
    }
}
