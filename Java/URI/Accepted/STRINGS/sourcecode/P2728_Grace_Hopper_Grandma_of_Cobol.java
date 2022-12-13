package URI.Accepted.STRINGS.sourcecode;
/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: AIZU ONLINE JUDGE
 * @Categories: STRING
 * @Problem: 2728 - Grace Hopper, Grandma of Cobol
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2728
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory:
 * @Submission: 3/25/18, 5:50:13 PM
 * @Runtime: 0.028s
 * @Solution:
 * @Note:
 */

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;

class P2728_Grace_Hopper_Grandma_of_Cobol {

    BufferedReader br;
    BufferedWriter bw;
    InputStreamReader ir;
    OutputStreamWriter ow;

    public P2728_Grace_Hopper_Grandma_of_Cobol() throws IOException {
        ir = new InputStreamReader(System.in);
        ow = new OutputStreamWriter(System.out);
        br = new BufferedReader(ir);
        bw = new BufferedWriter(ow);
        String input;
        while ((input = br.readLine()) != null) {
            String[] st = input.toLowerCase().split("-");
            char[] cobolChk = new char[]{'c', 'o', 'b', 'o', 'l'};
            boolean AC = true;
            for (int i = 0; i < 5; i++) {
                char first = st[i].charAt(0);
                char last = st[i].charAt(st[i].length() - 1);
                if (cobolChk[i] != first && cobolChk[i] != last) {
                    AC = false;
                    break;
                }
            }
            bw.append(AC ? "GRACE HOPPER\n" : "BUG\n");
        }
        bw.flush();
    }


}
