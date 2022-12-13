/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1105 Sub-prime
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1105
 * @Timelimit: 1 sec
 * @Status: Accepted 26/12/2015 - 17:09:52 Runtime:0.088s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1105_Sub_prime {

    static class Bank {

        int reserve, creditor, debenture;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while (!(input = br.readLine()).equals("0 0")) {
            String[] st = input.split(" ");
            int b = Integer.parseInt(st[0]);
            int n = Integer.parseInt(st[1]);
            Bank[] bank = new Bank[b];
            st = br.readLine().split(" ");
            for (int i = 0; i < b; i++) {
                bank[i] = new Bank();
                bank[i].reserve = Integer.parseInt(st[i]);
            }

            for (int i = 0; i < n; i++) {
                st = br.readLine().split(" ");
                int d = Integer.parseInt(st[0]);
                int c = Integer.parseInt(st[1]);
                int v = Integer.parseInt(st[2]);
                bank[d - 1].creditor = c;
                bank[d - 1].debenture = v;

                bank[c - 1].reserve += v;
                bank[d - 1].reserve -= v;
                bank[d - 1].debenture -= v;
            }

            boolean isPossible = true;
            for (int i = 0; i < b; i++) {
                if (bank[i].reserve < 0) {
                    isPossible = false;
                    break;
                }
            }

            bw.append(isPossible ? "S\n" : "N\n");
        }
        bw.flush();
    }

}
