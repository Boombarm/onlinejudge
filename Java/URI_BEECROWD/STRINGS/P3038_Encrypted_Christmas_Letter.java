package URI.Accepted.STRINGS.sourcecode;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class P3038_Encrypted_Christmas_Letter {

    static char decrypt(char c) {
        switch (c) {
            case '@':
                return 'a';
            case '&':
                return 'e';
            case '!':
                return 'i';
            case '*':
                return 'o';
            case '#':
                return 'u';
            default:
                return c;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = "";
        while ((line = br.readLine()) != null) {
            char[] sArr = line.toCharArray();
            for (char c : sArr) {
                bw.append(decrypt(c));
            }
            bw.newLine();
        }
        bw.flush();
    }

}
