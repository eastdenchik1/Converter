
/**
 * Converter
 */

import java.math.BigInteger;
import java.util.Random;

public class Converter {

    public static void main(String[] args) {
        BigInteger num = new BigInteger("Z", 36);
        BigInteger b = new BigInteger(new BigInteger("8").toString(2), 36);
        System.out.println(num);
        System.out.println(b);
        System.out.println("x");
    }
}