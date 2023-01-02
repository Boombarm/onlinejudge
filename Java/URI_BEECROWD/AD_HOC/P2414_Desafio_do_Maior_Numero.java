/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: AD-HOC
 * @Problem: 2414 - Desafio do Maior Número
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2414
 * @Timelimit:
 * @Status: Accepted
 * @Submission: 4/5/19, 1:59:38 AM
 * @Runtime:
 * @Solution:
 * @Note:
 */
package URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P2414_Desafio_do_Maior_Numero {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int n = st.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(st[i]);
            if (max < x) max = x;
        }
        System.out.println(max);

    }

}