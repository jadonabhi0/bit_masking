import java.util.LinkedList;
import java.util.List;

public class Subset_generate
{

    List<List<Integer>> list = new LinkedList<>();
    List<Integer> base = new LinkedList<>();
    public void subset(int[] array){
        list.add(base);

        for (int val : array){
            int n = list.size();

            for(int i = 0 ; i < n ; i++){
                List<Integer> temp = new LinkedList<>(list.get(i));
                temp.add(val);
                list.add(temp);
            }

        }
        System.out.println(list);
    }


    public static void main(String[] args) {

        Subset_generate s = new Subset_generate();
        s.subset(new int[]{1,2,3});

    }


}
