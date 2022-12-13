package  URI.Accepted.MATHEMATICS.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1279 Leap Year or Not Leap Year and … https://www.urionlinejudge.com.br/judge/en/problems/view/1279
//Accepted 02/10/2015 - 05:41:34 Runtime:0.136s
import java.math.BigInteger;
import java.util.Scanner;

public class P1279_Leap_Year_or_Not_Leap_Year_and {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            BigInteger year = new BigInteger(sc.next());
            if (isLeapYear(year)) {
                System.out.println("This is leap year.");
                if (year.mod(BigInteger.valueOf(15)).equals(BigInteger.ZERO)) {
                    System.out.println("This is huluculu festival year.");
                }
                if (year.mod(BigInteger.valueOf(55)).equals(BigInteger.ZERO)) {
                    System.out.println("This is bulukulu festival year.");
                }
            } else {
                if (year.mod(BigInteger.valueOf(15)).equals(BigInteger.ZERO)) {
                    System.out.println("This is huluculu festival year.");
                } else {
                    System.out.println("This is an ordinary year.");
                }
            }
            if (sc.hasNext()) {
                System.out.println("");
            }
        }
    }

    public static boolean isLeapYear(BigInteger year) {
        if (!year.mod(BigInteger.valueOf(4)).equals(BigInteger.ZERO)) {
            return false;
        } else if (year.mod(BigInteger.valueOf(400)).equals(BigInteger.ZERO)) {
            return true;
        } else if (year.mod(BigInteger.valueOf(100)).equals(BigInteger.ZERO)) {
            return false;
        } else {
            return true;
        }
    }

}
