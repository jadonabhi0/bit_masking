public class Kernighans___Algorithms {

    public static void main(String[] args) {

        // This Algorithm counts the number of On bits
        // TC --> O(1)

        int count = 0;
        int n = 80156865;
        System.out.println(Integer.toBinaryString(n));
        while(n != 0){
            int rmsb = n & -n;
            n -= rmsb;
            count++;
        }

        System.out.println(count);

    }


}
