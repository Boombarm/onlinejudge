/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: Mathematics
 * @Problem: 2129 - Factorial
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2129
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 1/24/17, 9:22:36 PM
 * @Runtime: 0.100s
 * @Solution: find last digit with Mathematic
 * @Note:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2129_Factorial {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        int count = 1;
        while ((input = br.readLine()) != null) {
            int n = Integer.parseInt(input);
            bw.append("Instancia " + (count++) + "\n" + fac(n) + "\n\n");
        }
        bw.flush();
    }

    static int fac(int n) {
        if (n <= 10) {
            switch (n) {
                case 0:
                    return 1;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 6;
                case 4:
                    return 4;
                case 5:
                    return 2;
                case 6:
                    return 2;
                case 7:
                    return 4;
                case 8:
                    return 2;
                case 9:
                    return 8;
                case 10:
                    return 8;
            }
        }
        return (((n / 10) % 2 == 1 ? 4 : 6) * fac(n / 5) * fac(n % 10)) % 10;
    }
}
