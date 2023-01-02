package URI.Accepted.BEGINNER.sourcecode;


/**
 * Created by Teerapat-BSD on 1/9/2018.
 * Answer : Accepted
 * Runtime : 0.016s
 * Submission : 1/9/18, 4:32:22 PM
 */

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class P2690_New_Password_RA {
    static Map<Character, Integer> upperCaseToKey = new TreeMap<Character, Integer>();

    static {
        upperCaseToKey.put('G', 0);
        upperCaseToKey.put('Q', 0);

        upperCaseToKey.put('I', 1);
        upperCaseToKey.put('S', 1);

        upperCaseToKey.put('E', 2);
        upperCaseToKey.put('O', 2);
        upperCaseToKey.put('Y', 2);

        upperCaseToKey.put('F', 3);
        upperCaseToKey.put('P', 3);
        upperCaseToKey.put('Z', 3);

        upperCaseToKey.put('J', 4);
        upperCaseToKey.put('T', 4);

        upperCaseToKey.put('D', 5);
        upperCaseToKey.put('N', 5);
        upperCaseToKey.put('X', 5);

        upperCaseToKey.put('A', 6);
        upperCaseToKey.put('K', 6);
        upperCaseToKey.put('U', 6);

        upperCaseToKey.put('C', 7);
        upperCaseToKey.put('M', 7);
        upperCaseToKey.put('W', 7);

        upperCaseToKey.put('B', 8);
        upperCaseToKey.put('L', 8);
        upperCaseToKey.put('V', 8);

        upperCaseToKey.put('H', 9);
        upperCaseToKey.put('R', 9);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String word = br.readLine();
            int length = word.length();
            int count = 0;
            for (int i = 0; i < length; i++) {
                char c = word.charAt(i);
                if (c == ' ') continue;
                if (Character.isUpperCase(c)) {
                    bw.append("" + upperCaseToKey.get(c));
                } else {
                    bw.append("" + ((c - 97) % 10));
                }
                count++;
                if (count == 12) {
                    break;
                }
            }
            bw.newLine();
        }
        bw.flush();
    }
}
