package URI.Accepted.AD_HOC.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: AD-HOC
 * @Problem: 2868 Wrrrong
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2868
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 10/1/18, 11:11:58 AM
 * @Runtime: 0.076s
 * @Solution: print 'r' by distance by between true and wrong answer
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P2868_Wrrrong {

    static int a, b, trueAnswer, wrongAnswer;
    static String operation;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String[] st = br.readLine().split(" ");
            a = Integer.parseInt(st[0]);
            operation = st[1];
            b = Integer.parseInt(st[2]);
            wrongAnswer = Integer.parseInt(st[4]);

            switch (operation) {
                case "+":
                    trueAnswer = a + b;
                    break;
                case "-":
                    trueAnswer = a - b;
                    break;
                case "x":
                    trueAnswer = a * b;
                    break;
            }

            int distance = Math.abs(trueAnswer - wrongAnswer);
            String print = "E";
            for (int i = 0; i < distance; i++) {
                print += "r";
            }
            bw.append(print + "ou!\n");
        }
        bw.flush();
    }
}
