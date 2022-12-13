/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1639 Generate Random Numbers
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1639
 * @Timelimit: 1 sec
 * @Status: Accepted 28/12/2015 - 14:35:06 Runtime:0.464s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.HashMap;

public class P1639_Generate_Random_Numbers {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        String input;
        while (!(input = br.readLine()).equals("0")) {
            int counting = 0;
            HashMap<Long, Long> map = new HashMap<Long, Long>();
            long a = Long.parseLong(input);
            int n = input.length();
            int start = n / 2;
            if (a == 10000) {
                out.write("0\n".getBytes());
            } else {
                do {
                    String b = (a * a) + "";
                    b = (a * a) + "";
                    while (b.length() < 2 * n) {
                        b = "0" + b;
                    }
                    Long c = Long.parseLong(b.substring(start, start + n));
                    map.put(a, c);
                    a = c;
                    counting++;
                } while (map.get(a) == null);
                out.write((counting + "\n").getBytes());
            }
        }
        out.flush();
    }
}
