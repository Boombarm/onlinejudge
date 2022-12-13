package th.in.devboom.uri.accepted;

/**
 * Created by Teerapat-BSD on 1/31/2018.
 * Answer : Accepted
 * Submission : 1/31/18, 2:34:55 PM
 * Runtime : 0.024s
 */

import java.io.*;
import java.util.HashMap;

public class P2678_Voice_Dialing {

    static HashMap<Character, Character> phoneMap = new HashMap<Character, Character>();

    static {
        phoneMap.put('A', '2');
        phoneMap.put('B', '2');
        phoneMap.put('C', '2');

        phoneMap.put('D', '3');
        phoneMap.put('E', '3');
        phoneMap.put('F', '3');

        phoneMap.put('G', '4');
        phoneMap.put('H', '4');
        phoneMap.put('I', '4');

        phoneMap.put('J', '5');
        phoneMap.put('K', '5');
        phoneMap.put('L', '5');

        phoneMap.put('M', '6');
        phoneMap.put('N', '6');
        phoneMap.put('O', '6');

        phoneMap.put('P', '7');
        phoneMap.put('Q', '7');
        phoneMap.put('R', '7');
        phoneMap.put('S', '7');

        phoneMap.put('T', '8');
        phoneMap.put('U', '8');
        phoneMap.put('V', '8');

        phoneMap.put('W', '9');
        phoneMap.put('X', '9');
        phoneMap.put('Y', '9');


    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String in;
        while ((in = br.readLine()) != null) {
            int size = in.length();
            String answer = "";
            for (int i = 0; i < size; i++) {
                char c = in.charAt(i);
                if (c == '-') {
                    continue;
                }
                if (Character.isDigit(c)) {
                    answer += c;
                } else if (c == '#' || c == '*') {
                    answer += c;
                } else if (Character.isLetter(c) == true) {
                    c = Character.toUpperCase(c);
                    answer += phoneMap.get(c);
                }
            }
            bw.append(answer + "\n");
        }
        bw.flush();
    }

}
