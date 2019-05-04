
/**
 * Converter
 */

import java.math.BigInteger;
import java.util.Scanner;

public class Converter {

    public static String baseConversion(String number, int srcBase, int dstBase) {
        return Integer.toString(Integer.parseInt(number, srcBase), dstBase);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String number;
        int srcBase, dstBase;

        System.out.println("Введите основание исходного числа:");
        srcBase = sc.nextInt();

        System.out.println("Введите основание итогового числа:");
        dstBase = sc.nextInt();

        System.out.println("Введите число для перевода:");
        if (srcBase >= 16 && srcBase <= 36) {
            number = sc.next();
        } else {
            number = String.valueOf(sc.nextInt());
        }

        System.out.println("Исходная система " + srcBase);
        System.out.println("Итоговая система " + dstBase);
        System.out.println("Число " + number + "(" + srcBase + ")=" + baseConversion(number, srcBase, dstBase) + "("
                + dstBase + ")");
    }
}