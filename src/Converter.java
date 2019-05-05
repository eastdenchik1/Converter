
/**
 * program: Number converter
 * author: Denis Sviridov
 * web-site: https://sviridovden.ru
 * version: 1.0.0
 * 
 */

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Converter {

    public static String baseConversion(String number, int srcBase, int dstBase) {

        String res = null;

        try {
            res = Integer.toString(Integer.parseInt(number, srcBase), dstBase);
        } catch (NumberFormatException e) {
            System.out.println("Number contains wrong symbols for current source base.");
        }

        return res;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String number = null, result = null;
        int srcBase, dstBase;

        System.out.println("Enter base of source number:");
        srcBase = sc.nextInt();

        System.out.println("Enter base of destination number:");
        dstBase = sc.nextInt();

        System.out.println("Enter the number for convertion:");
        if (srcBase >= 10 && srcBase <= 36 && dstBase > 1 && dstBase < 37) {
            number = sc.next();
            result = baseConversion(number, srcBase, dstBase);
        } else if (srcBase >= 2 && srcBase <= 9 && dstBase > 1 && dstBase < 37) {
            number = String.valueOf(sc.nextInt());
            result = baseConversion(number, srcBase, dstBase);
        } else {
            System.out.println("Error! There're no such system");
            result = null;
        }

        if (result != null) {
            System.out.println("Source system " + srcBase);
            System.out.println("Destination system " + dstBase);
            System.out.println("Number " + number + "(" + srcBase + ")=" + baseConversion(number, srcBase, dstBase)
                    + "(" + dstBase + ")");
        }

    }
}