/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1581 International Chat
 * @Timelimit: 1 sec
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1581
 * @Status: Accepted 17/10/2015 - 10:19:53 Runtime:0.048s
 * @Solution:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1581_International_Chat {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());
            String language = br.readLine();
            boolean check = true;
            for (int j = 1; j < k; j++) {
                if (!br.readLine().equals(language)) {
                    check = false;
                }
            }
            if (check) {
                System.out.println(language);
            } else {
                System.out.println("ingles");
            }
        }

    }

}
