import java.util.ArrayList;

public class Gray__Bits {


    public static ArrayList<String> grayBit(int n){

        if (n == 1){
            ArrayList<String> bcase = new ArrayList<>();
            bcase.add("0");
            bcase.add("1");
            return bcase;
        }


        ArrayList<String> rres = grayBit(n-1);
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0 ; i < rres.size() ; i++){
            String s1 = rres.get(i);
            list.add("0"+s1);
        }
        for (int i = rres.size()-1; i >= 0 ; i--){
            String s1 = rres.get(i);
            list.add("1"+s1);
        }
        return list;
    }

    public static void main(String[] args) {

        System.out.println(grayBit(10));

    }
}
