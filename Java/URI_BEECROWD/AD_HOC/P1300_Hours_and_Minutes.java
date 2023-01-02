/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1300 Hours and Minutes
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1300
 * @Timelimit: 1 sec
 * @Status: Accepted 07/11/2015 - 09:18:59 Runtime:0.072s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.OutputStreamWriter;

public class P1300_Hours_and_Minutes {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String n;
        while ((n = br.readLine()) != null) {
            bw.append(checking(Integer.parseInt(n)) + "\n");
        }
        bw.flush();
    }

    static String checking(int n) {
        if (n % 6 == 0) {
            return "Y";
        }
        return "N";
    }

}
