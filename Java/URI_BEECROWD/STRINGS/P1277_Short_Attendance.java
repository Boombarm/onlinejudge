/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1277 Short Attendance
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1277
 * @Timelimit: 1 sec
 * @Status: Accepted 04/12/2015 - 05:26:36 Runtime:0.072s
 * @Solution:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1277_Short_Attendance {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        int i = 0;
        do {
            int n = Integer.parseInt(br.readLine());
            String[] students = br.readLine().split(" ");
            String[] record = br.readLine().split(" ");
            int m = students.length;
            int printed = 0;
            for (int j = 0; j < m; j++) {
                int total = 0;
                int attend = 0;
                for (int k = 0; k < record[j].length(); k++) {
                    char c = record[j].charAt(k);
                    switch (c) {
                        case 'M':
                            break;
                        case 'A':
                            total++;
                            break;
                        case 'P':
                            attend++;
                            total++;
                            break;
                    }
                }
                if ((attend * 100 / total) < 75) {
                    bw.write(printed == 0 ? students[j] : " " + students[j]);
                    printed++;
                }
            }
            bw.newLine();
        } while (++i < t);
        bw.flush();
    }

}
