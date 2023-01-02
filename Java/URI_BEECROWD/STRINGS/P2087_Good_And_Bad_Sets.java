package th.in.devboom.uri.accepted;

/**
 * Created by Teerapat-BSD on 1/30/2018.
 * Answer : Accepted
 * Submission : 1/30/18, 11:06:15 AM
 * Runtime : 0.260s
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2087_Good_And_Bad_Sets {

    static char[][] letter;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String in;
        int n;
        loop:
        while (!(in = br.readLine()).equals("0")) {
            try {
                n = Integer.parseInt(in);
            } catch (NumberFormatException e) {
                continue loop;
            }
            letter = new char[n][100];
            for (int i = 0; i < n; i++) {
                while ((in = br.readLine()).isEmpty()) ;
                String newWord = in;
                if (isPrefix(newWord, n, newWord.length())) {
                    bw.append("Conjunto Ruim\n");
                    continue loop;
                }
            }
            bw.append("Conjunto Bom\n");
        }
        bw.flush();
    }

    static boolean isPrefix(String newWord, int rowSize, int wordSize) {
        for (int r = 0; r < rowSize; r++) {
            if (letter[r][0] == '\0') {
                letter[r] = newWord.toCharArray();
                return false;
            }
            if (letter[r][0] == newWord.charAt(0)) {
                boolean chk = true;
                int size = letter[r].length;
                chkLoop:
                for (int i = 1; i < size && i < wordSize; i++) {
                    if (letter[r][i] != newWord.charAt(i)) {
                        chk = false;
                        break chkLoop;
                    }
                }
                if (chk == true) {
                    return true;
                }
            }

        }
        return false;
    }


}
