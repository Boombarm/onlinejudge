package  URI.Accepted.AD_HOC.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1786 SSN 2 https://www.urionlinejudge.com.br/judge/en/problems/view/1786
//Accepted 11/10/2015 - 20:06:37 Runtime: 0.300s
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1786_SSN_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = "";
        while ((number = br.readLine()) != null) {
            int b1, b2;
            int sum = 0;
            for (int i = 1; i <= number.length(); i++) {
                sum += (int) (number.charAt(i - 1) - '0') * i;
            }

            b1 = sum % 11;
            if (b1 == 10) {
                b1 = 0;
            }

            sum = 0;
            for (int i = 0, j = number.length(); i < number.length(); i++, j--) {
                sum += (int) (number.charAt(i) - '0') * j;
            }
            b2 = sum % 11;
            if (b2 == 10) {
                b2 = 0;
            }

            for (int i = 1; i <= number.length(); i++) {
                if (i == number.length()) {
                    System.out.print(number.charAt(i - 1) + "-");
                } else {
                    System.out.print(i % 3 == 0 ? number.charAt(i - 1) + "." : number.charAt(i - 1));
                }
            }
            System.out.print(b1 + "" + b2 + "\n");
        }

    }

}
