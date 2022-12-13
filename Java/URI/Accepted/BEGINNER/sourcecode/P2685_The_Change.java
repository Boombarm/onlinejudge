package URI.Accepted.BEGINNER.sourcecode;

/**
 * Created by Teerapat-BSD on 1/11/2018.
 * Answer : Accepted
 * Runtime : 0.024s
 * Submission : 1/11/18, 12:16:30 PM
 */

import java.io.*;

public class P2685_The_Change {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in , "ISO-8859-1"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));
        String input;
        while ((input = br.readLine()) != null) {
            int n = Integer.parseInt(input);
            if (n == 360 || n >= 0 && n <= 89) {
                bw.append("Bom Dia!!\n");
            } else if (n >= 90 && n <= 179) {
                bw.append("Boa Tarde!!\n");
            } else if (n >= 180 && n <= 269) {
                bw.append("Boa Noite!!\n");
            } else if (n >= 270 && n <= 359) {
                bw.append("De Madrugada!!\n");
            }
        }
        bw.flush();
    }
}
