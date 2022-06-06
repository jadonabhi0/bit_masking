import java.util.Scanner;

public class Basics {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i = sc.nextInt(); // on
        int j = sc.nextInt(); // off
        int k = sc.nextInt(); // toggle
        int m = sc.nextInt(); // check

        int onmask = (1 << i);
        int ofmask = ~(1 << j);
        int togglemask = (1 << k);
        int checkmask = (1 << m);

        System.out.println(n | onmask);
        System.out.println(n & ofmask);
        System.out.println(n ^ togglemask);
        System.out.println((n & checkmask) == 0 ? false:true);


    }


}
