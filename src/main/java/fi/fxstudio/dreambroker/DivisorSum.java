package fi.fxstudio.dreambroker;

public class DivisorSum {
    public static int getSum(int exclusiveLimit, int... divisors) {
        int sum = 0;

        if (divisors == null) {
            return sum;
        }

        for (int i = 1; i < exclusiveLimit; i++) {
            for (int div : divisors) {
                if (i % div == 0) {
                    sum += div;
                }
            }
        }

        return sum;
    }
}
