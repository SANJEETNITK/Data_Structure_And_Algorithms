package math;

import java.util.Arrays;

public class Prime {

    public boolean isPrimeBasic(int n) {
        if (n < 2) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isPrimeBasicEnhanced(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isPrimeFastest(int n) {
        if (n < 2) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return true;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i+2) == 0) {
                return false;
            }
        }

        return true;
    }

    public boolean[] sieveOfEratosthenes(int n) {

        boolean prime[] = new boolean[n + 1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;

        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }

        return prime;
    }
}
