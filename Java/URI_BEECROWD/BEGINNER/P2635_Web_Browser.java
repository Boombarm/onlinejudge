package URI.Accepted.BEGINNER.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: GRAPH
 * @Problem: 2635 - Web Browser
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2635
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory:
 * @Submission: 10/20/18, 4:23:38 PM
 * @Runtime: 0.064s
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.LinkedList;

public class P2635_Web_Browser {

    static LinkedList<String>[] memory = new LinkedList[26];
    static int n, q;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            input = br.readLine();
            int index = input.charAt(0) - 'a';
            if (memory[index] == null) {
                memory[index] = new LinkedList<>();
            }
            memory[index].add(input);
        }
        q = Integer.parseInt(br.readLine());
        for (int i = 0; i < q; i++) {
            input = br.readLine();
            int index = input.charAt(0) - 'a';
            if (memory[index] == null) {
                bw.append("-1");
            } else {
                int maxLenght = 0;
                int totalWord = 0;
                for (String s : memory[index]) {
                    if (s.startsWith(input)) {
                        totalWord++;
                        int length = s.length();
                        if (maxLenght < length) {
                            maxLenght = length;
                        }
                    }
                }
                bw.append((totalWord > 0 ? totalWord + " " + maxLenght : "-1") + "\n");
            }
        }
        bw.newLine();
        bw.flush();
    }

}
