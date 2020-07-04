public class Arithmetic {
    public float add(float a, float b) {
        return a + b;
    }

    public float subtract(float a, float b) {
        return a - b;
    }

    public float multiply(float a, float b) {
        return a*b;
    }

    public float divide(float a, float b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException();
        }
        return a/b;
    }

    public float pow(float a, float b) {
        int n = 1;
        for (int i = 1; i < b; i++) {
            n *= a;
        }
        return n;
    }
}
