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
//        *** test code ***
//        System.out.println(dz(bt, sh, it, ch));
//        System.out.println(leapYear(1700));
//        System.out.println(leapYear(1800));
//        System.out.println(leapYear(1900));
//        System.out.println(leapYear(1600));
//        System.out.println(leapYear(2004));
    }

    public static double dz(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    public static boolean dvaChisla(long a, long b) {
        if ((a + b >= 10) && (a + b <= 20))
            return true;
        return false;
    }

    /** Написать метод, который определяет является ли год високосным. Каждый 4-й год является
    високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     */
    public static boolean leapYear(int year) {
        if (year/100 % 4 ==0 &&  year % 4 == 0)
            return true;
        else if (year % 100 == 0)
            return false;
        else return false;
    }
}
