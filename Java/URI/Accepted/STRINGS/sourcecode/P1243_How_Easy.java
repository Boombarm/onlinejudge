/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge:URI Online Judge
 * @Problem:1243 How Easy
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1243
 * @Timelimit: 1 sec
 * @Status: Accepted 19/12/2015 - 10:44:20 Runtime:0.152s
 * @Solution:
 */
package Accepted.STRINGS.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P1243_How_Easy {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        Pattern p = Pattern.compile("[a-zA-Z]+(\\.)?{1}");
        String input;
        while ((input = br.readLine()) != null) {
            int words = 0;
            int sumLenght = 0;
            String[] st = input.split(" ");
            int i = 0;
            do {
                Matcher m = p.matcher(st[i]);
                if (m.matches()) {
                    int mLength = m.group().length();
                    if (m.group().charAt(mLength - 1) == '.') {
                        sumLenght += mLength - 1;
                    } else {
                        sumLenght += mLength;
                    }
                    words++;
                }
            } while (++i < st.length);

            double average = 0;
            if (words != 0) {
                average = sumLenght / words;
            }

            int answer = 250;
            if (average >= 4 && average <= 5) {
                answer = 500;
            } else if (average > 5) {
                answer = 1000;
            }

            out.write((answer + "\n").getBytes());
        }

        out.flush();
    }

}
