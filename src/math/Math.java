package math;

public class Math {

    /**
     * returns power of two numbers in o(sqrt(n)) time
     */
    int pow(int base, int power) {

        int ans = 1;

        while (power > 0) {
            if (power % 2 == 1) ans *= base;
            base *= base;
            power /= 2;
        }

        return ans;
    }

}


