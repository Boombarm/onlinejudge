/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1728 Hard to Believe, But True!
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1728
 * @Status: Accepted 20/10/2015 - 10:03:49 Runtime:0.036s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1728_Hard_to_Believe_But_True {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        while ((input = br.readLine()) != null) {
            if (input.equals("0+0=0")) {
                System.out.println("True");
                break;
            }
            input = new StringBuilder(input).reverse().toString();
            String[] st = input.split("[+=]");
            int result = Integer.parseInt(st[0]);
            int b = Integer.parseInt(st[1]);
            int a = Integer.parseInt(st[2]);
            if ((a + b) == result) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }

}
