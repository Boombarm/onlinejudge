/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: Beginner
 * @Problem: 2483 Merry Christmaaas!
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2483
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission:  12/23/16, 6:31:51 PM
 * @Runtime: 0.064s
 * @Solution: 
 * @Note: 
 */

package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class P2483_Merry_Christmaaas {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        bw.write("Feliz nat");
        while (n-- > 0) {
            bw.append("a");
        }
        bw.write("l!\n");
        bw.flush();
    }
    
}
