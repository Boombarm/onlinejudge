/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1802 Books Catalog
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1802
 * @Timelimit: 1 sec
 * @Status: Accepted 16/01/2016 - 14:13:25 Runtime:0.092s
 * @Solution: sort by value and of k set and sum
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.OutputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class P1802_Books_Catalog {

    static ArrayList<Integer> portuguese, mathematics, physics, chemistry, biology;
    static ArrayList<Integer> setValue = new ArrayList<Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        portuguese = getBooks(br.readLine());
        mathematics = getBooks(br.readLine());
        physics = getBooks(br.readLine());
        chemistry = getBooks(br.readLine());
        biology = getBooks(br.readLine());
        int k = Integer.parseInt(br.readLine());
        grouping();
        Collections.sort(setValue, Collections.reverseOrder());
        int answer = 0;
        for (int i = 0; i < k; i++) {
            answer += setValue.get(i);
        }
        out.write((answer + "\n").getBytes());
        out.flush();
    }

    static ArrayList<Integer> getBooks(String input) {
        String[] st = input.split(" ");
        int n = Integer.parseInt(st[0]);
        ArrayList<Integer> subjectSet = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            subjectSet.add(Integer.parseInt(st[i]));
        }
        return subjectSet;
    }

    static void grouping() {
        for (int i = 0; i < portuguese.size(); i++) {
            int b1 = portuguese.get(i);
            for (int j = 0; j < mathematics.size(); j++) {
                int b2 = mathematics.get(j);
                for (int k = 0; k < physics.size(); k++) {
                    int b3 = physics.get(k);
                    for (int l = 0; l < chemistry.size(); l++) {
                        int b4 = chemistry.get(l);
                        for (int m = 0; m < biology.size(); m++) {
                            int b5 = biology.get(m);
                            setValue.add(b1 + b2 + b3 + b4 + b5);
                        }
                    }
                }
            }
        }
    }

}
