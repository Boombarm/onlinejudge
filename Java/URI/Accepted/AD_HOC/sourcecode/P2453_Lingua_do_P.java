/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: AD-HOC
 * @Problem: 2453 - Língua do P
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2453
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 7/7/19, 5:59:00 PM
 * @Runtime: 0.084s
 * @Solution:
 * @Note:
 */
package URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P2453_Lingua_do_P {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String answer = "";
        String[] input = br.readLine().split(" ");
        int word = 0;
        for (String st : input) {
            String tmp = "";
            int i = 1;
            int size = st.length();
            while (i < size) {
                tmp += st.charAt(i);
                i += 2;
            }
            answer += word > 0 ? " " + tmp : tmp;
            word++;
        }
        System.out.println(answer);
    }

}