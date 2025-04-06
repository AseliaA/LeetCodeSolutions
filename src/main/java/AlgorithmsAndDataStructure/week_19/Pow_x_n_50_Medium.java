package AlgorithmsAndDataStructure.week_19;

public class Pow_x_n_50_Medium {
    public static void main(String[] args) {}

    //Azret's version
    //T: O(log N)
    //S: O(log N)
    public double myPow(double x, int n) {
        long exponent = (long) n;

        if (exponent < 0) {
            exponent = -exponent;
            x = 1 / x;
        }
        return myPow_(x, exponent);
    }

    private double myPow_(double x, long exponent) {
        if (exponent == 0)
            return 1;

        if (exponent % 2 == 0) {
            return myPow_(x * x, exponent / 2);
        } else {
            return myPow_(x * x, exponent / 2) * x;
        }
    }

    //own solution
    //too slow, not passing all test cases - probably due to "Time Limit Exceeded"
    public double myPow1(double x, int n) {
        if (x == 0 && n <= 0) return 0.00;

        if (n < 0) {
            return 1 / pow(x, Math.abs(n));
        } else {
            return pow(x, n);
        }
    }

    public double pow(double x, int n) {
        double result = x;
        n--;

        while (n != 0) {
            result = result * x;
            n--;
        }
        return result;
    }
}