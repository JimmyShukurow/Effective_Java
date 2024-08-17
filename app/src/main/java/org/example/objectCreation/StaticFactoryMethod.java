package org.example.objectCreation;

import java.math.BigInteger;
import java.security.SecureRandom;

public class StaticFactoryMethod {
    public static void main(String[] args) {
        BigInteger bigInteger = BigInteger.probablePrime(5, new SecureRandom());
        System.out.println(bigInteger);
    }
}
