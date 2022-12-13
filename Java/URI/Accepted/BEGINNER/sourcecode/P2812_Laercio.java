package URI.Accepted.BEGINNER.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: BEGINNER
 * @Problem: 2812 - Laércio
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2812
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory:
 * @Submission: 1/1/19, 9:09:05 PM
 * @Runtime: 0.092s
 * @Solution: insert sort odd number
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class P2812_Laercio {

    static ArrayList<Integer> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            String[] st = br.readLine().split(" ");

            list = new ArrayList<>();
            int[] number = new int[m];
            for (int j = 0; j < m; j++) {
                number[j] = Integer.parseInt(st[j]);
                if (number[j] % 2 != 0) {
                    addValue(number[j]);//insert sort
                }
            }
            int r = list.size() - 1;
            int l = 0;
            int turn = 1;
            while (l <= r) {
                bw.append((turn > 1 ? " " : "") + (turn++ % 2 != 0 ? list.get(r--) : list.get(l++)));
            }
            bw.newLine();
        }
        bw.flush();
    }


    private static void addValue(int val) {
        if (list.size() == 0) {
            list.add(val);
        } else if (list.get(0) > val) {
            list.add(0, val);
        } else if (list.get(list.size() - 1) < val) {
            list.add(list.size(), val);
        } else {
            int i = 0;
            while (list.get(i) < val) {
                i++;
            }
            list.add(i, val);
        }
    }


}
