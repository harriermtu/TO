/*
After test, there is bug for value -2147483648 (the minimus integer);
as for integer -(-2147483648) is still -2147483648, not 2147483648.
So we need a larger type which could contains value 2147483648
typedef long long_int;

if the sizeof(long) is equal to sizeof(int) in some system,
you may need to use long long instead

typedef long long long_int;

 */

public class MathOps {

    public static int add(int x, int y) {

        //zakresy
        if (y == 0) return x;
        int a = x ^ y;        // add
        int b = (x & y) << 1;   // carry
        return add(a, b);
    }

    public static double sqrt(double x) {

        //ujemne, zakresy
        double y = x;
        double e = 1e-15;

        while (Math.abs(x / y - y) > e * y) {
            y = (x / y + y) / 2.0;
        }
        return y;
    }

    public static double pow(double x, int y) {
        //problem z zakresami, 0^0, 0^-2147483648 rowna sie zero a nie powinno
        if (y == 0) return 1;
        if (y == 1) return x;

        boolean negative = false;
        if (y < 0) {
            negative = true;
            y = -y;
        }

        double r = pow(x, y / 2);
        r = r * r;

        if (y % 2 != 0) r = r * x;
        if (negative) r = 1 / r;

        return r;
    }

    public static int divide(int dividend, int divisor) {

        //nie dziala na -2147483648
        if (divisor == 0)
            throw new ArithmeticException("divisor is 0");

        boolean neg_dividend = (dividend < 0);
        boolean neg_divisor = (divisor < 0);

        if (neg_dividend)
            dividend = (dividend ^ -1) + 1;
        if (neg_divisor)
            divisor = (divisor ^ -1) + 1;

        int result = 0;

        while (dividend >= divisor) {
            dividend -= divisor;
            result++;
        }

        if (neg_dividend ^ neg_divisor)
            result = (result ^ -1) + 1;

        return result;

    }

    public static int divide1(int dividend, int divisor) {
        if ((divisor == 0)) throw new AssertionError();

        boolean bNeg = false;

        if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0))
            bNeg = true;

        long la = dividend;
        long ula = la < 0 ? -la : la;
        long lb = divisor;
        long ulb = lb < 0 ? -lb : lb;

        int msb = 0;
        while ((ulb << msb) < ula) msb++;

        int q = 0;
        for (int i = msb; i >= 0; i--) {
            if ((ulb << i) > ula) continue;
            q |= (1 << i);
            ula -= (ulb << i);
        }
        return bNeg ? -q : q;
    }

    public static void main(String[] args) {

        System.out.println("add: " + add(-2147483647, -2147483647));
        //wiesza sie dla -1; dla 0 dziala
        System.out.println("sqrt: " + sqrt(0));
        System.out.println("pow: " + pow(0, 0));

        //przyjmuje ujemne liczby dla zero
        System.out.println("pow: " + pow(0, -1));

        //zakres wiesza
        //System.out.println("divide: " + divide(-2147483648, -2147483648));

        //dzielenie przez zero
        System.out.println("divide: " + divide1(2, 0));


    }
}
