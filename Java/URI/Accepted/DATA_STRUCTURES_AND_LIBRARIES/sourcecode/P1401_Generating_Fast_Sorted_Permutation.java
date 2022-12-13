/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1401 Generating Fast, Sorted Permutation
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1401
 * @Timelimit: 2 sec
 * @Status:  Accepted
 * @Submission: 4/6/17, 5:51:48 AM
 * @Runtime: 0.576s
 * @Solution: sort and permutations
 * @Note:
 */
package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.TreeSet;

public class P1401_Generating_Fast_Sorted_Permutation {

    private static char[] word;
    private static TreeSet<String> set;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            set = new TreeSet();//sorted Structure
            word = br.readLine().toCharArray();
            int size = word.length;
            permutations(word, 0, size - 1);
            for (String entry : set) {
                bw.write(entry + "\n");
            }
            bw.newLine();
        }
        bw.flush();
    }

    private static void permutations(char[] word, int l, int r) {
        if (l == r) {
            set.add(new String(word));
        } else {
            for (int i = l; i <= r; i++) {
                swap(l, i);
                permutations(word, l + 1, r);
                swap(l, i);
            }
        }
    }

    private static void swap(int i, int j) {
        char c = word[i];
        word[i] = word[j];
        word[j] = c;
    }

}
