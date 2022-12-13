/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1680 Edge
 * @Link: https://www.urionlinejudge.com.br/judge/problems/view/1680/rate:1680/rating:3
 * @Timelimit: 1 sec
 * @Status: Accepted 29/12/2015 - 12:34:04 Runtime:0.056s
 * @Solution: Drawing Line from Command (A = clockwise, V = counter-clockwise)
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1680_Edge {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while ((input = br.readLine()) != null) {
            bw.append("300 420 moveto\n");
            bw.append("310 420 lineto\n");
            int x = 310, y = 420;
            int n = input.length();
            int i = 0;
            char before = 'R';
            do {
                switch (input.charAt(i)) {
                    case 'A':
                        switch (before) {
                            case 'R':
                                y -= 10;
                                before = 'D';
                                break;
                            case 'T':
                                x += 10;
                                before = 'R';
                                break;
                            case 'L':
                                y += 10;
                                before = 'T';
                                break;
                            case 'D':
                                x -= 10;
                                before = 'L';
                                break;
                        }
                        break;
                    case 'V':
                        switch (before) {
                            case 'R':
                                y += 10;
                                before = 'T';
                                break;
                            case 'T':
                                x -= 10;
                                before = 'L';
                                break;
                            case 'L':
                                y -= 10;
                                before = 'D';
                                break;
                            case 'D':
                                x += 10;
                                before = 'R';
                                break;
                        }
                        break;
                }
                bw.append(x + " " + y + " lineto\n");
            } while (++i < n);
            bw.append("stroke\n");
            bw.append("showpage\n");
        }
        bw.flush();
    }

}
