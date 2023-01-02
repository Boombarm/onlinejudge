/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1586 Tug of War
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1586
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 4/7/17, 6:52:49 PM
 * @Runtime: 0.208s
 * @Solution: Binary Search imprement
 * @Note:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1586_Tug_of_War {

    static int n;
    static String[] name;
    static int[] value;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while ((n = Integer.parseInt(br.readLine())) != 0) {
            name = new String[n];
            value = new int[n];
            for (int i = 0; i < n; i++) {
                String studentName = br.readLine();
                name[i] = studentName;
                for (int v : studentName.toCharArray()) {
                    value[i] += v;
                }
            }
            int index = bs();
            bw.append(index != -1 ? name[index] + "\n" : "Impossibilidade de empate.\n");
        }
        bw.flush();
    }

    static int bs() {
        int b = 0;
        int e = n - 1;
        int mid;
        long teamA, teamB;
        while (b <= e) {
            mid = (b + e) / 2;
            teamA = 0;
            int p1 = 1;
            for (int i = mid; i >= 0; i--) {
                teamA += value[i] * p1++;
            }
            teamB = 0;
            int p2 = 1;
            for (int i = mid + 1; i <= n - 1; i++) {
                teamB += value[i] * p2++;
            }

            if (teamA == teamB) {
                return mid;
            } else if (teamA > teamB) {
                e = mid - 1;
            } else {
                b = mid + 1;
            }

        }
        return -1;
    }

}
