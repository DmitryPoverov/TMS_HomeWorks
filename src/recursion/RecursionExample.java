package recursion;

import java.math.BigInteger;

// Задача, с которой позвонил Дима Деркач и я предложил использовать BigInteger чтобы все вмещалось.

public class RecursionExample {
    public static void main(String[] args) {

        System.out.println(getFactorial(11));
    }

    public static BigInteger getFactorial (long value) {
        BigInteger bigInteger = new BigInteger(String.valueOf(value));
        if (value <= 1)
        {
            return new BigInteger("1");
        }
        return bigInteger.multiply(getFactorial(value - 1));

    }
}

