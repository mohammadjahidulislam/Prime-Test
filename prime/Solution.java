import java.util.*;

class Prime {
    void checkPrime(int... numbers) {
        for (int n : numbers) {
            if (n < 2) continue;

            boolean prime = true;

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        Prime p = new Prime();

        p.checkPrime(a);
        p.checkPrime(a, b);
        p.checkPrime(a, b, c);
        p.checkPrime(a, b, c, d);
        p.checkPrime(a, b, c, d, e);

        sc.close();
    }
}