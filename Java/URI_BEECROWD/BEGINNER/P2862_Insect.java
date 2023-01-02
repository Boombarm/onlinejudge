package URI.Accepted.BEGINNER.sourcecode;


/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: BEGINNER
 * @Problem: 2862 - Insect!
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2862
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory:
 * @Submission: 12/31/18, 4:27:20 AM
 * @Runtime: 0.048s
 * @Solution:
 * @Note:
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2862_Insect {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            bw.append((x > 8000 ? "Mais de 8000!" : "Inseto!") + "\n");
        }
        bw.flush();
    }
}
