/**
 * Created by Maxim on 11.06.2017.
 */
public class main {
    public static void main(String[] args) {
        byte bt = 1;
        short sh = 2;
        int it = 3;
        long ln = 4;
        float fl = 4;
        double db = 3f/5;
        boolean bl = false;
        char ch = 'A';
        System.out.println(dz(bt, sh, it, ch));
    }

    public static double dz(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    public static boolean dvaChisla(long a, long b) {
        if ((a + b >= 10) && (a + b <= 20))
            return true;
        return false;
    }
}
