package AIZU.Accepted.ITP1;


/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: AIZU ONLINE JUDGE
 * @Categories: ITP1
 * @Problem: ITP1_9_C: Card Game
 * @Link: http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_9_C
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory: 25272 KB
 * @Submission: 2018-09-10 12:50
 * @Runtime: 00:04 s
 * @Solution: compare String by alphabetical
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ITP1_9_C_Card_Game {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int taroScore = 0, hanakoScore = 0;
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String[] st = br.readLine().split(" ");
            String taro = st[0];
            String hanako = st[1];
            Integer comp = taro.compareTo(hanako);
            if (comp > 0) {
                taroScore += 3;
            } else if (comp < 0) {
                hanakoScore += 3;
            } else {
                taroScore++;
                hanakoScore++;
            }
        }
        bw.append(taroScore + " " + hanakoScore + "\n");
        bw.flush();
    }
}
