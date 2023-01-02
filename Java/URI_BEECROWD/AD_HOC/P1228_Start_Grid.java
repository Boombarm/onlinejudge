/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1228 Start Grid
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1228
 * @Timelimit: 1 sec
 * @Status: Accepted 05/12/2015 - 05:28:13 Runtime:0.056s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P1228_Start_Grid {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        String input;
        while ((input = br.readLine()) != null) {
            int n = Integer.parseInt(input);
            String[] start = br.readLine().split(" ");
            String[] end = br.readLine().split(" ");
            int counting = 0;
            int i = 0;
            do {
                if (!start[i].equals(end[i])) {
                    for (int j = i; j < n; j++) {
                        if (start[j].equals(end[i])) {
                            String temp = start[j];
                            for (int k = j; k > i; k--) {
                                String temp2 = start[k];
                                start[k] = start[k - 1];
                                start[k - 1] = temp2;
                            }
                            counting += j - i;
                            break;
                        }
                    }
                }

            } while (++i < n);
            out.write((counting + "\n").getBytes());
        }
        out.flush();
    }

}
