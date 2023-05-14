package math;

public class GCD {

    /**
     * returns gcd of two numbers
     */
    public int gcd(int a, int b) {
        if(a == 0) return b;
        return gcd(b % a, a);
    }

}