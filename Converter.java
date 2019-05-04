
/**
 * Converter
 */

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class Converter {

    public static void main(String[] args) {
        // BigInteger num = new BigInteger("Z", 36);
        // BigInteger b = new BigInteger(new BigInteger("8").toString(2), 36);
        // BigInteger num2 = new BigInteger("10");
        // System.out.println(num);
        // System.out.println(num2);
        // System.out.println(b);

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");

        int number = sc.nextInt();

        System.out.println("Спасибо! Вы ввели число " + number);

    }
}