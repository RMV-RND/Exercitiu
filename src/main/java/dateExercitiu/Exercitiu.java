package dateExercitiu;

public class Exercitiu {
    public static int countNumberOfDigits(Number num) {
        if (num == null) {
            throw new IllegalArgumentException("Input value cannot be null");
        }
        long intValue;
        if (num instanceof Integer || num instanceof Long) {
            intValue = num.longValue();
        } else {
            double doubleValue = num.doubleValue();
            if (doubleValue > Long.MAX_VALUE || doubleValue < Long.MIN_VALUE) {
                throw new IllegalArgumentException("Input value is too large");
            }
            intValue = (long) doubleValue;
        }
        if (intValue == 0) {
            return 1; // special case for zero
        }
        int numDigits = 0;
        if (intValue < 0) {
            intValue = -intValue; // ignore the sign
        }
        while (intValue > 0) {
            numDigits++;
            intValue /= 10;
        }
        return numDigits;
    }
}
