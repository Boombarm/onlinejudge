package AIZU.Accepted.ALDS1;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: AIZU ONLINE JUDGE
 * @Categories: Search
 * @Problem: ALDS1_4_C: Dictionary
 * @Link: http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_4_C
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory: 191200 KB
 * @Submission: 2018-03-15 17:18
 * @Runtime: 01:13 s
 * @Solution: Set
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class ALDS1_4_C_Dictionary {

    @SuppressWarnings("unchecked")
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Set<String> dictionary = new TreeSet<String>();
        while (n-- > 0) {
            String[] command = br.readLine().split(" ");
            switch (command[0]) {
                case "insert":
                    dictionary.add(command[1]);
                    break;
                case "find":
                    bw.append(dictionary.contains(command[1]) ? "yes\n" : "no\n");
                    break;
            }
        }
        bw.flush();
    }

}
