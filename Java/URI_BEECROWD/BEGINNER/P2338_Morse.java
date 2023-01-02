/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2338 Morse
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2338
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 12/13/16, 12:03:17 AM
 * @Runtime: 0.036s
 * @Solution: convert and decode morse
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class P2338_Morse {

    static BufferedReader br;
    static BufferedWriter bw;
    static String morse = "";
    static Map morseTable = new HashMap<String, Character>();

    static {
        morseTable.put(".-", 'a');
        morseTable.put("-...", 'b');
        morseTable.put("-.-.", 'c');
        morseTable.put("-..", 'd');
        morseTable.put(".", 'e');
        morseTable.put("..-.", 'f');
        morseTable.put("--.", 'g');
        morseTable.put("....", 'h');
        morseTable.put("..", 'i');
        morseTable.put(".---", 'j');
        morseTable.put("-.-", 'k');
        morseTable.put(".-..", 'l');
        morseTable.put("--", 'm');
        morseTable.put("-.", 'n');
        morseTable.put("---", 'o');
        morseTable.put(".--.", 'p');
        morseTable.put("--.-", 'q');
        morseTable.put(".-.", 'r');
        morseTable.put("...", 's');
        morseTable.put("-", 't');
        morseTable.put("..-", 'u');
        morseTable.put("...-", 'v');
        morseTable.put(".--", 'w');
        morseTable.put("-..-", 'x');
        morseTable.put("-.--", 'y');
        morseTable.put("--..", 'z');
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int line = Integer.parseInt(br.readLine());
        while (line-- > 0) {
            String s = br.readLine();
            int length = s.length();
            for (int i = 0; i < length; i++) {
                switch (s.charAt(i)) {
                    case '=':
                        if ((i + 2 <= length - 1) && s.charAt(i + 1) == '=') {//dash
                            morse += "-";
                            i += 2;
                        } else {//dit
                            morse += ".";
                        }
                        break;
                    case '.':
                        int count = 0;
                        for (int j = i + 1; j < length; j++) {
                            if (s.charAt(j) != '.') {
                                break;
                            }
                            count++;
                            if (count == 6) {
                                break;
                            }
                        }
                        if (count >= 2) {

                            if (count == 6) {
                                i += 6;
                                morse += "S";
                            } else if (count == 2) {
                                morse += " ";
                                i += 2;
                            }
                        }
                        break;
                }

            }
            bw.append(decode(morse.split("S")) + "\n");
            clear();
        }
        bw.flush();
    }

    static void clear() {
        morse = "";
    }

    static String decode(String[] morse) {
        String answer = "";
        for (int i = 0; i < morse.length; i++) {
            String[] st = morse[i].split(" ");
            for (int j = 0; j < st.length; j++) {
                answer += morseTable.get(st[j]);
            }
            if (i < morse.length - 1) {
                answer += " ";
            }
        }
        return answer;
    }
}
