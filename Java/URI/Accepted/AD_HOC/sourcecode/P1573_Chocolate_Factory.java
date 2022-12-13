/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1573 Chocolate Factory
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1573
 * @Timelimit: 1 sec
 * @Status: Accepted 04/01/2016 - 09:03:17 Runtime:0.084s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P1573_Chocolate_Factory {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        String input;
        while (!(input = br.readLine()).equals("0 0 0")) {
            String[] st = input.split(" ");
            int a = Integer.parseInt(st[0]);
            int b = Integer.parseInt(st[1]);
            int c = Integer.parseInt(st[2]);
            int answer = (int) Math.cbrt(a * b * c);
            out.write((answer + "\n").getBytes());
        }
        out.flush();
    }

}
