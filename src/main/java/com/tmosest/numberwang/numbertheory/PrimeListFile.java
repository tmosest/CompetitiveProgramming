package com.tmosest.numberwang.numbertheory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class PrimeListFile {

    private String filepath;
    private List<Prime> primes;
    
    public PrimeListFile() {
        this.filepath = "";
        this.primes = new ArrayList<>();
    }

    public PrimeListFile(String filePath) {
        this.filepath = filePath;
        this.primes = new ArrayList<>();
    }

    public PrimeListFile(String filePath, List<Prime> primes) {
        this.filepath = filePath;
        this.primes = primes;
    }

    public List<Prime> getPrimes() {
        return this.primes;
    }

    public void setPrimes(List<Prime> primes) {
        this.primes = new ArrayList<>(primes);
    }

    public void readFromFile() {
        this.primes = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(this.filepath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // System.out.println(line);
                this.primes.add(new Prime(new BigInteger(line), this.primes.size() + 1));
            }
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    public void writeToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(this.filepath))) {
            // writer.printf("Primes up to %s\n", easyToReadVal);

            this.primes.iterator().forEachRemaining(prime -> {
                // System.out.println(prime.prime);
                writer.printf("%d\n", prime.prime);
            });

        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    public void readAndGenerateWriteIfDNE(String easyToReadVal) {
        String val = easyToReadVal.replace(",", "");

        this.filepath = String.format("results/primes/primes-up-to-%s.txt", val);
        this.readFromFile();

        if (this.primes.size() == 0) {
            BigInteger num = new BigInteger(val);
            this.primes = Prime.generatePrimes(num);
            this.writeToFile();
        }
    }

    private static class PrimeGap {

        public Prime first;
        public Prime last;
        
        public PrimeGap(Prime first, Prime last) {
            this.first = first;
            this.last = last;
        }

        public BigInteger diff() {
            return last.prime.subtract(first.prime);
        }

        @Override
        public String toString() {
            return String.format("%s : (%s, %s)", diff().toString(), first.prime.toString(), last.prime.toString());
        }

        public void print() {
            System.out.println(toString());
        }
    }

    public static void main(String[] args) {
        String easyToReadVal = "1,000,000,000";
        PrimeListFile primeListFile = new PrimeListFile();
        primeListFile.readAndGenerateWriteIfDNE(easyToReadVal);

        List<PrimeGap> primeGaps = new ArrayList<>();
        Map<BigInteger, BigInteger> counts = new HashMap<>();

        for (int i = 0; i < primeListFile.primes.size() - 1; i++) {
            Prime first = primeListFile.primes.get(i);
            Prime second  = primeListFile.primes.get(i + 1);

            PrimeGap primeGap = new PrimeGap(first, second);
            primeGaps.add(primeGap);
            primeGap.print();

            BigInteger count = counts.getOrDefault(primeGap.diff(), BigInteger.ZERO);
            counts.put(primeGap.diff(), count.add(BigInteger.ONE));
        }

        System.out.println(String.format("Size: %d", primeGaps.size()));

        for (Entry<BigInteger, BigInteger> entry : counts.entrySet()) {
            System.out.println(String.format("%s : %s", entry.getKey(), entry.getValue()));
        }
    }
}
