package  URI.Accepted.AD_HOC.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1867 The Greater One-digit Number https://www.urionlinejudge.com.br/judge/en/problems/view/1867
//Accepted 10/10/2015 - 05:40:52 Runtime:0.044s
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P1867_The_Greater_One_digit_Number {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while ((line = br.readLine()) != null) {
            if (line.isEmpty()) {
                continue;
            }
            if (line.equals("0 0")) {
                break;
            }
            String[] number = line.split(" ");
            BigInteger a = BigInteger.ZERO, b = BigInteger.ZERO;
            int oneDigitA, oneDigitB;

            if (number[0].length() > 1) {
                while (number[0].length() != 1) {
                    for (int i = 0; i < number[0].length(); i++) {
                        a = a.add(BigInteger.valueOf((int) number[0].charAt(i) - '0'));
                    }
                    number[0] = a.toString();
                    a = BigInteger.ZERO;
                }
                oneDigitA = Integer.parseInt(number[0]);
            } else {
                oneDigitA = Integer.parseInt(number[0]);
            }

            if (number[1].length() > 1) {
                while (number[1].length() != 1) {
                    for (int i = 0; i < number[1].length(); i++) {
                        b = b.add(BigInteger.valueOf((int) number[1].charAt(i) - '0'));
                    }
                    number[1] = b.toString();
                    b = BigInteger.ZERO;
                }
                oneDigitB = Integer.parseInt(number[1]);
            } else {
                oneDigitB = Integer.parseInt(number[1]);
            }

            if (oneDigitA == oneDigitB) {
                System.out.println("0");
            } else if (oneDigitA > oneDigitB) {
                System.out.println("1");
            } else {
                System.out.println("2");
            }

        }
    }

}
