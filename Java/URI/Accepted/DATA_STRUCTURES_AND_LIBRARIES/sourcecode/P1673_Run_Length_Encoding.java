/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: DATA STRUCTURES AND LIBRARIES
 * @Problem: 1673 - Run Length Encoding
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1673
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 2/19/18, 4:48:49 PM
 * @Language: Java 7 (OpenJDK 1.7.0) [+2s]
 * @Runtime: 0.064s
 * @Solution:
 * @Note:
 */
package URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class P1673_Run_Length_Encoding {

    static LinkedList<Letter> resultList;

    static class Letter {
        char data;
        int count = 0;

        public Letter(char data, int count) {
            this.data = data;
            this.count = count;
        }
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in, "ISO-8859-1");
        OutputStreamWriter ow = new OutputStreamWriter(System.out, "ISO-8859-1");
        BufferedReader br = new BufferedReader(ir);
        BufferedWriter bw = new BufferedWriter(ow);
        String input;
        while ((input = br.readLine()) != null) {
            if (input.isEmpty()) {
                bw.newLine();
                continue;
            }
            char[] c = input.toCharArray();
            int size = c.length;
            resultList = new LinkedList();
            int count = 1;
            int i = 1;
            while (i < size) {
                if (c[i - 1] == c[i]) {
                    count++;
                } else {
                    resultList.add(new Letter(c[i - 1], count));
                    count = 1;
                }
                i++;
            }
            resultList.add(new Letter(c[i - 1], count));

            String out = "";
            int lastCount = 0;
            for (Letter letter : resultList) {
                if (letter.count == 1) {
                    if (lastCount != 1) {
                        out += '1';
                    }
                    if (letter.data == '1') {
                        out += "11";
                    } else {
                        out += "" + letter.data;
                    }
                    lastCount = 1;
                } else {
                    if (lastCount == 1) {
                        out += '1';
                    }
                    int tmpCount = letter.count;
                    while (tmpCount >= 9) {
                        out += "9" + letter.data;
                        tmpCount -= 9;
                    }
                    if (tmpCount > 0) {
                        if (tmpCount == 1 && letter.data == '1') {
                            out += "1" + "11";
                        } else {
                            out += tmpCount + "" + letter.data;
                        }
                        lastCount = tmpCount == 1 ? 1 : 0;
                    }
                }
            }
            if (lastCount == 1) {
                out += '1';
            }
            bw.append(out + "\n");
        }

        bw.flush();
    }

}
