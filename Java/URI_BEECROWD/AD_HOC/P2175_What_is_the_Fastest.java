/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: Ad-Hoc 
 * @Problem: 2175 What is the Fastest?
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2175
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 1/20/17, 1:18:27 AM
 * @Runtime: 0.056s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2175_What_is_the_Fastest {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        double Otavio = Double.parseDouble(st[0]);
        double Bruno = Double.parseDouble(st[1]);
        double Ian = Double.parseDouble(st[2]);
        if (Otavio == Bruno || Otavio == Ian || Bruno == Ian) {
            System.out.println("Empate");
        } else if (Otavio < Bruno && Otavio < Ian) {
            System.out.println("Otavio");
        } else if (Bruno < Otavio && Bruno < Ian) {
            System.out.println("Bruno");
        } else if (Ian < Otavio && Ian < Bruno) {
            System.out.println("Ian");
        }
    }

}
