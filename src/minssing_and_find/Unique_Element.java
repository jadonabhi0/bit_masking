package minssing_and_find;

public class Unique_Element {

    // * all elements occur even times except a single element
    // --> x ^ x = 0
    // --> x ^ 0 = x;

    // constraint is TC--> O(n) no extra space complexity.


    public static void find(int[] array){
        int ele = 0;
        for (int i : array){
            ele ^= i;
        }
        System.out.println(ele);
    }


    public static void main(String[] args) {
        int[] array ={1,1,2,2,3};
        find(array);
    }
}
