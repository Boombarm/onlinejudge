/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1222 Short Story Competition
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1222
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 2/22/16, 1:24:05 AM
 * @Runtime: 0.044s
 * @Solution: Counting
 * @Note:  Given the maximum number of characters per line, the maximum number of lines per page, and the words
 *         **he wants to know the minimum number of pages
 */
package Accepted.STRINGS.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P1222_Short_Story_Competition {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        String input;
        while ((input = br.readLine()) != null) {
            String[] st = input.split(" ");
            int n = Integer.parseInt(st[0]);//number of words of the short story
            int l = Integer.parseInt(st[1]);//maximum number of lines per page
            int c = Integer.parseInt(st[2]);//maximum number of characters per line
            String[] word = br.readLine().split(" ");
            int line = 1;
            int i = 1;
            int coutingChar = word[0].length();
            while (i < n) {
                int wordSize = word[i].length();
                if (coutingChar + wordSize + 1 <= c) {
                    coutingChar += wordSize + 1;
                } else {
                    coutingChar = wordSize;
                    line++;
                }
                i++;
            }
            int page = (int) Math.ceil((double) line / l);
            out.write((page + "\n").getBytes());
        }
        out.flush();
    }

}
