package com.omidmohebbise.guava;

import com.google.common.math.IntMath;
import com.google.common.math.LongMath;

public class GuavaMathExample {
    public static void main(String[] args) {
        // Example of checked addition
        try {
            int result = IntMath.checkedAdd(Integer.MAX_VALUE, 1);
            System.out.println("Checked Addition Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Overflow occurred during addition.");
        }

        // Example of factorial
        int factorial = IntMath.factorial(5);
        System.out.println("Factorial of 5: " + factorial);

        // Example of greatest common divisor (GCD)
        int gcd = IntMath.gcd(18, 24);
        System.out.println("GCD of 18 and 24: " + gcd);

        // Example of checked multiplication
        try {
            long result = LongMath.checkedMultiply(Long.MAX_VALUE, 2);
            System.out.println("Checked Multiplication Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Overflow occurred during multiplication.");
        }

        // Example of logarithmic ceiling
        long logCeiling = LongMath.log2(1024, java.math.RoundingMode.CEILING);
        System.out.println("Logarithmic Ceiling of 1024: " + logCeiling);

        // Example of greatest common divisor (GCD)
        long lgcd = LongMath.gcd(36, 48);
        System.out.println("GCD of 36 and 48: " + lgcd);
    }
}
