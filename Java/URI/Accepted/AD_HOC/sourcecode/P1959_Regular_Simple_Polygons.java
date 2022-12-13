/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1959 Regular Simple Polygons
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1959
 * @Timelimit: 1 sec
 * @Status: Accepted 04/11/2015 - 16:10:15 Runtime:0.052s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P1959_Regular_Simple_Polygons {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        String[] st = br.readLine().split(" ");
        long n = Long.parseLong(st[0]);
        long l = Long.parseLong(st[1]);
        long answer = n * l;
        out.write((answer+"\n").getBytes());
        out.flush();
    }

}
