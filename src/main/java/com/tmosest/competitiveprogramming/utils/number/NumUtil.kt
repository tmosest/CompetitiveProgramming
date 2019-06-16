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

    /**
     * Function to convert an integer to a string in a given base.
     */
    fun Int.convertToBaseString(base: Int) : String {
        val stringBuilder = StringBuilder()
        if (this == 0) {
            stringBuilder.append(0)
            return stringBuilder.toString()
        }
        val isNegative = this < 0
        var tmp = this
        if (isNegative) {
            tmp *= -1
        }
        while (this > 0) {
            val digit = tmp % base
            stringBuilder.insert(0, digit)
            tmp /= base
        }
        if (isNegative) {
            stringBuilder.insert(0, '-')
        }
        return stringBuilder.toString()
    }
}
