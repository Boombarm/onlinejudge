/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1583 Contamination
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1583
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 2/10/16, 10:21:17 PM
 * @Runtime: 0.044s
 * @Solution: Flood fill Algorithm
 * @Note:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class P1583_Contamination {

    private static class Contamination {

        int row, colum;

        public Contamination(int row, int colum) {
            this.row = row;
            this.colum = colum;
        }

    }
    private static LinkedList<Contamination> queue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while (!(input = br.readLine()).equals("0 0")) {
            String[] st = input.split(" ");
            int n = Integer.parseInt(st[0]);
            int m = Integer.parseInt(st[1]);
            queue = new LinkedList<Contamination>();
            char[][] map = new char[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = br.readLine().toCharArray();
                boolean isReplace = false;
                for (int j = 0; j < m; j++) {
                    if (map[i][j] == 'T') {
                        queue.add(new Contamination(i, j));//add Starting Index
                    }
                }
            }

            while (!queue.isEmpty()) {
                Contamination now = queue.removeFirst();
                int row = now.row;
                int colum = now.colum;

                //Change LEFT
                if ((colum - 1) > -1 && map[row][colum - 1] == 'A') {
                    map[row][colum - 1] = 'T';
                    queue.add(new Contamination(row, colum - 1));
                }

                //Change RIGHT
                if ((colum + 1) < m && map[row][colum + 1] == 'A') {
                    map[row][colum + 1] = 'T';
                    queue.add(new Contamination(row, colum + 1));
                }

                //Change ABOVE 
                if ((row - 1) > -1 && map[row - 1][colum] == 'A') {
                    map[row - 1][colum] = 'T';
                    queue.add(new Contamination(row - 1, colum));
                }

                //Change BELOW
                if ((row + 1) < n && map[row + 1][colum] == 'A') {
                    map[row + 1][colum] = 'T';
                    queue.add(new Contamination(row + 1, colum));
                }
            }

            for (int i = 0; i < n; i++) {
                bw.append(new String(map[i]) + "\n");
            }
            bw.newLine();
        }
        bw.flush();
    }

}
