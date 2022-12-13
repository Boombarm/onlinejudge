package  URI.Accepted.AD_HOC.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1769 SSN 1 https://www.urionlinejudge.com.br/judge/en/problems/view/1769
//Accepted 03/10/2015 - 15:01:19 Runtime:0.172s
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1769_SSN_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numberLine = "";
        while ((numberLine = br.readLine()) != null) {
            int sum = 0;
            boolean valid1 = false, valid2 = false;
            int b1 = 0, b2 = 0;
            numberLine = numberLine.replaceAll("[\\.|-]", "");
            for (int i = 1; i <= 9; i++) {
                sum += (int) (numberLine.charAt(i - 1) - '0') * i;
            }

            b1 = sum % 11;
            if (b1 == 10) {
                b1 = 0;
            }

            if (b1 != (int) (numberLine.charAt(9) - '0')) {
                System.out.println("CPF invalido");
            } else {
                sum = 0;
                for (int i = 0, j = 9; i < 9; i++, j--) {
                    sum += (int) (numberLine.charAt(i) - '0') * j;
                }
                b2 = sum % 11;
                if (b2 == 10) {
                    b2 = 0;
                }

                if (b2 == (int) (numberLine.charAt(10) - '0')) {
                    System.out.println("CPF valido");
                } else {
                    System.out.println("CPF invalido");
                }
            }
        }
    }

}
