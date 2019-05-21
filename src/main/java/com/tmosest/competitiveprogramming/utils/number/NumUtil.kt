package com.tmosest.competitiveprogramming.utils.number

object NumUtil {

    /**
     * Calculate the GCD of two numbers.
     * @param one first number
     * @param two second number.
     * @return The gcd of the two numbers.
     */
    fun calculateGcd(one: Long, two: Long) : Long {
        if (two == 0L) {
            return one
        }
        return calculateGcd(two, one % two)
    }
}
