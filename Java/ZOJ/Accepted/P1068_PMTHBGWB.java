package ZOJ.Accepted;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: ZOJ
 * @Categories: ZOJ Problem Set Vol 1
 * @Problem: 1068 : PMTHBGWB
 * @Link: http://acm.zju.edu.cn/onlinejudge/showProblem.do?problemCode=1068
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory: 1102(KB)
 * @Submission: 2018-09-13 21:44:25
 * @Runtime: 76(ms)
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.TreeMap;


public class P1068_PMTHBGWB {

    static TreeMap<Character, String> charToMorseCode = new TreeMap<Character, String>();
    static TreeMap<String, Character> morseCodeTochar = new TreeMap<String, Character>();

    static {
        charToMorseCode.put('A', ".-");
        morseCodeTochar.put(".-", 'A');

        charToMorseCode.put('B', "-...");
        morseCodeTochar.put("-...", 'B');

        charToMorseCode.put('C', "-.-.");
        morseCodeTochar.put("-.-.", 'C');

        charToMorseCode.put('D', "-..");
        morseCodeTochar.put("-..", 'D');

        charToMorseCode.put('E', ".");
        morseCodeTochar.put(".", 'E');

        charToMorseCode.put('F', "..-.");
        morseCodeTochar.put("..-.", 'F');

        charToMorseCode.put('G', "--.");
        morseCodeTochar.put("--.", 'G');

        charToMorseCode.put('H', "....");
        morseCodeTochar.put("....", 'H');

        charToMorseCode.put('I', "..");
        morseCodeTochar.put("..", 'I');

        charToMorseCode.put('J', ".---");
        morseCodeTochar.put(".---", 'J');

        charToMorseCode.put('K', "-.-");
        morseCodeTochar.put("-.-", 'K');

        charToMorseCode.put('L', ".-..");
        morseCodeTochar.put(".-..", 'L');

        charToMorseCode.put('M', "--");
        morseCodeTochar.put("--", 'M');

        charToMorseCode.put('N', "-.");
        morseCodeTochar.put("-.", 'N');

        charToMorseCode.put('O', "---");
        morseCodeTochar.put("---", 'O');

        charToMorseCode.put('P', ".--.");
        morseCodeTochar.put(".--.", 'P');

        charToMorseCode.put('Q', "--.-");
        morseCodeTochar.put("--.-", 'Q');

        charToMorseCode.put('R', ".-.");
        morseCodeTochar.put(".-.", 'R');

        charToMorseCode.put('S', "...");
        morseCodeTochar.put("...", 'S');

        charToMorseCode.put('T', "-");
        morseCodeTochar.put("-", 'T');

        charToMorseCode.put('U', "..-");
        morseCodeTochar.put("..-", 'U');

        charToMorseCode.put('V', "...-");
        morseCodeTochar.put("...-", 'V');

        charToMorseCode.put('W', ".--");
        morseCodeTochar.put(".--", 'W');

        charToMorseCode.put('X', "-..-");
        morseCodeTochar.put("-..-", 'X');

        charToMorseCode.put('Y', "-.--");
        morseCodeTochar.put("-.--", 'Y');

        charToMorseCode.put('Z', "--..");
        morseCodeTochar.put("--..", 'Z');

        charToMorseCode.put('_', "..--");
        morseCodeTochar.put("..--", '_');

        charToMorseCode.put(',', ".-.-");
        morseCodeTochar.put(".-.-", ',');

        charToMorseCode.put('.', "---.");
        morseCodeTochar.put("---.", '.');

        charToMorseCode.put('?', "----");
        morseCodeTochar.put("----", '?');
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int t = 1;
        while (n-- > 0) {
            String input = br.readLine();
            String lenMorseCode = "";
            String morseCode = "";
            for (char c : input.toCharArray()) {
                String cur_morseCode = charToMorseCode.get(c);
                morseCode += cur_morseCode;
                lenMorseCode = cur_morseCode.length() + lenMorseCode;
            }
            String answer = "";

            int start = 0;
            for (char c : lenMorseCode.toCharArray()) {
                int size = Integer.parseInt(c + "");
                if (size == 1) {
                    answer += morseCodeTochar.get(morseCode.charAt(start) + "");
                    start++;
                    continue;
                }
                answer += morseCodeTochar.get(morseCode.substring(start, start + size));
                start += size;
            }

            bw.append((t++) + ": " + answer + "\n");
        }
        bw.flush();
    }


}
