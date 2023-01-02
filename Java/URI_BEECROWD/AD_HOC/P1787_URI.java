/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge 1787
 * @Problem: 1787 URI
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1787
 * @Timelimit: 1 sec
 * @Status: Accepted 28/10/2015 - 15:05:01 Runtime:0.492s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1787_URI {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String line = br.readLine();
            if (line.equals("0")) {
                break;
            }
            int uiltonScore = 0, ritaScore = 0, ingredScore = 0;
            int n = Integer.parseInt(line);
            for (int i = 0; i < n; i++) {
                String[] st = br.readLine().split(" ");
                int uiltonNumber = Integer.parseInt(st[0]);
                int ritaNumber = Integer.parseInt(st[1]);
                int ingredNumber = Integer.parseInt(st[2]);
                int maxNumber = (uiltonNumber + ritaNumber + Math.abs(uiltonNumber - ritaNumber)) / 2;
                maxNumber = (maxNumber + ingredNumber + Math.abs(maxNumber - ingredNumber)) / 2;
                if (isPowerOfTwo(uiltonNumber)) {
                    uiltonScore += 1;
                    if (uiltonNumber == maxNumber) {
                        uiltonScore += 1;
                    }
                }
                if (isPowerOfTwo(ritaNumber)) {
                    ritaScore += 1;
                    if (ritaNumber == maxNumber) {
                        ritaScore += 1;
                    }
                }
                if (isPowerOfTwo(ingredNumber)) {
                    ingredScore += 1;
                    if (ingredNumber == maxNumber) {
                        ingredScore += 1;
                    }
                }

            }
            int maxScore = (uiltonScore + ritaScore + Math.abs(uiltonScore - ritaScore)) / 2;
            maxScore = (maxScore + ingredScore + Math.abs(maxScore - ingredScore)) / 2;
            int count = 0;
            String answer = "";
            if (uiltonScore == maxScore) {
                count++;
                answer = "Uilton";
            }
            if (ritaScore == maxScore) {
                count++;
                if (count == 2) {
                    bw.write("URI\n");
                    bw.flush();
                    continue;
                }
                answer = "Rita";
            }
            if (ingredScore == maxScore) {
                count++;
                if (count >= 2) {
                    bw.write("URI\n");
                    bw.flush();
                    continue;
                }
                answer = "Ingred";
            }
            bw.write(answer + "\n");
            bw.flush();
        }
    }

    static boolean isPowerOfTwo(int x) {
        int powerOfTwo = 2;
        while (powerOfTwo < x && powerOfTwo < 1000000000) {
            powerOfTwo *= 2;
        }
        return (x == powerOfTwo);
    }
}
