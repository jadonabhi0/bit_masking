public class Josephus___Special {



    public int pow0f2(int n){
        int i = 1;
        while(i*2 <= n){
            i = i*2;
        }
        return i;
    }

    public int josePhus(int n){
        int l = n - pow0f2(n);
        return 2 * l + 1;
    }
    public static void main(String[] args) {
     Josephus___Special j = new Josephus___Special();
        System.out.println(j.josePhus(7));

    }
}
