package URI.Accepted.STRINGS.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: STRING
 * @Problem: 2153 Sanduicheiche
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2153
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 1/30/18, 2:45:28 PM
 * @Runtime: 0.020s
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.TreeSet;

public class P2153_Sanduicheiche {

    static TreeSet<String> set = new TreeSet<String>();
    static LinkedList<Integer> indexMap = new LinkedList<Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String in;
        char[] letter;

        while ((in = br.readLine()) != null) {
            letter = in.toCharArray();
            int size = letter.length;
            //find index
            char c = letter[size - 1];
            for (int j = size - 2; j >= 0; j--) {
                if (letter[j] == c) {
                    indexMap.push(j);
                }
            }

            //checking
            loop:
            for (int index : indexMap) {
                int s1Start = size - 1;
                int s1Size = (size - (index + 1));

                int s2Start = index;
                int s2Size = index + 1;
                if (s2Size < s1Size) {
                    continue loop;
                }
                boolean found = true;

                chk:
                for (int i = s1Start, j = s2Start; i >= s2Size; i--, j--) {
                    if (letter[i] != letter[j]) {
                        found = false;
                        break chk;
                    }
                }
                if (found) {
                    String answer = new String(letter, 0, s2Size);
                    set.add(answer);
                }
            }
            if (set.isEmpty()) {
                set.add(new String(letter));
            }
            for (String s : set) {
                bw.append(s + "\n");
            }
            set.clear();
            indexMap.clear();
        }
        bw.flush();
    }

}
