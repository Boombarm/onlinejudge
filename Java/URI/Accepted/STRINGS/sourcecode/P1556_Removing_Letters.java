package th.in.devboom.uri.accepted;

/**
 * Created by Teerapat-BSD on 1/23/2018.
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1556
 * Note : Letter Max Size 1000
 * Algorithm: bruteForce
 * Answer : Accepted
 * Runtime : 1.396s
 * Submission : 2/13/18, 3:46:13 PM
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.TreeSet;

public class P1556_Removing_Letters {

    static TreeSet<String> set = new TreeSet<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String in;
        while ((in = br.readLine()) != null) {
            bruteForce(in);
            for (String s : set) {
                bw.append(s + "\n");
            }
            bw.newLine();
            set.clear();
        }
        bw.flush();
    }

    static void bruteForce(String text) {
        if (!text.isEmpty()) {
            set.add(text);
            int size = text.length();
            for (int i = 0; i < size; i++) {
                String s = remove(text, i);
                if (set.contains(s)) {
                    continue;
                }
                bruteForce(s);
            }
        }
    }

    static String remove(String text, int index) {
        return text.substring(0, index) + text.substring(index + 1);
    }

}
