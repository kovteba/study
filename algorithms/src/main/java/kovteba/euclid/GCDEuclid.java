package kovteba.euclid;

public class GCDEuclid {

    public static void main(String[] args) {
        System.out.println(gcdEuclid(5, 10));
    }

    public static int gcdEuclid(int a, int b) {
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        }
        int r = a % b;
        return gcdEuclid(b, r);
    }
}
