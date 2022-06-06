import java.util.Scanner;

public class RightMostSet__BitMask {


    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int rmsb = n & -n;

        System.out.println(Integer.toBinaryString(rmsb));

    }
}
