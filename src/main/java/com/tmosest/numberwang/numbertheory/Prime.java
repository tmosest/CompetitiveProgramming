package com.tmosest.numberwang.numbertheory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Prime {
    
    public int index = -1;
    public BigInteger prime = BigInteger.ZERO;

    public Prime(BigInteger prime) {
        this.prime = new BigInteger(prime.toString());
    }

    public Prime(BigInteger prime, int index) {
        this.prime = new BigInteger(prime.toString());
        this.index = index;
    }

    public static List<Prime> generatePrimes(BigInteger limit) {

        List<Prime> primes = new ArrayList<>();
        
        primes.add(new Prime(new BigInteger("2"),  1));
        primes.add(new Prime(new BigInteger("3"),  2));

        BigInteger runner = new BigInteger("5");

        while (runner.compareTo(limit) < 0) {
            
            boolean isPrime = true;

            for (Prime prime : primes) {
                if (runner.mod(prime.prime) == BigInteger.ZERO) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                Prime prime = new Prime(runner, primes.size() + 1);
                primes.add(prime);
            }

            // Only odd primes.
            runner = runner.add(BigInteger.TWO);
        }

        return primes;
    }

    public static Prime largestPrimeFactor(BigInteger num) {
        
        // TODO should be the square root of num.
        List<Prime> primes = generatePrimes(num);

        for (int i = primes.size() - 1; i > -1; i--) {
			if (num.mod(primes.get(i).prime) == BigInteger.ZERO) {
                return primes.get(i);
            }
		}

		return new Prime(num);
    }

    public static void main(String[] args) {
        String easyToReadVal = "1,000";
        String val = easyToReadVal.replace(",", "");
        String filename = String.format("results/primes/primes-up-to-%s.txt", val);
        
        BigInteger num = new BigInteger(val);

        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.printf("Primes up to %s\n", easyToReadVal);

            generatePrimes(num).iterator().forEachRemaining(prime -> {
                System.out.println(prime.prime);
                writer.printf("%d\n", prime.prime);
            });

        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
