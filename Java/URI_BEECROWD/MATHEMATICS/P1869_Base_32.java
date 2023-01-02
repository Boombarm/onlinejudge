package  URI.Accepted.MATHEMATICS.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1869 Base 32 https://www.urionlinejudge.com.br/judge/problems/view/1869/rate:1869/rating:1
//Accepted 09/10/2015 - 00:08:25 Runtime:0.048s
import java.math.BigInteger;
import java.util.Scanner;

public class P1869_Base_32 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            BigInteger n = sc.nextBigInteger();
            BigInteger max = BigInteger.valueOf(2).pow(64);
            if (n.compareTo(max) < 0) {
                System.out.println(getBase32(n));
                if (n.equals(BigInteger.ZERO)) {
                    break;
                }
            } else {
                System.out.println("FVVVVVVVVVVVV");
            }
        }
    }

    static String getBase32(BigInteger num) {
        if (num.compareTo(BigInteger.valueOf(10)) < 0) {
            return num + "";
        }

        String answer = "";
        for (BigInteger bi = num;
                bi.compareTo(BigInteger.ZERO) > 0;
                bi = bi.divide(BigInteger.valueOf(32))) {

            BigInteger r = bi.mod(BigInteger.valueOf(32));
            answer = r.compareTo(BigInteger.valueOf(10)) < 0
                    ? r + answer : bigInt2Char(r) + answer;
        }
        return answer;
    }

    static char bigInt2Char(BigInteger num) {
        char c = 0;
        switch (num.intValue()) {
            case 10:
                c = 'A';
                break;
            case 11:
                c = 'B';
                break;
            case 12:
                c = 'C';
                break;
            case 13:
                c = 'D';
                break;
            case 14:
                c = 'E';
                break;
            case 15:
                c = 'F';
                break;
            case 16:
                c = 'G';
                break;
            case 17:
                c = 'H';
                break;
            case 18:
                c = 'I';
                break;
            case 19:
                c = 'J';
                break;
            case 20:
                c = 'K';
                break;
            case 21:
                c = 'L';
                break;
            case 22:
                c = 'M';
                break;
            case 23:
                c = 'N';
                break;
            case 24:
                c = 'O';
                break;
            case 25:
                c = 'P';
                break;
            case 26:
                c = 'Q';
                break;
            case 27:
                c = 'R';
                break;
            case 28:
                c = 'S';
                break;
            case 29:
                c = 'T';
                break;
            case 30:
                c = 'U';
                break;
            case 31:
                c = 'V';
                break;
        }

        return c;
    }
}
