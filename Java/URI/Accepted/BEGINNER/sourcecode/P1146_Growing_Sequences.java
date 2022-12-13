package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1146 Growing Sequences https://www.urionlinejudge.com.br/judge/en/problems/view/1146
//Accepted 30/10/2015 - 18:18:37 Runtime:0.348s
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P1146_Growing_Sequences {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        while (true) {
            String line = br.readLine();
            if (line.equals("0")) {
                break;
            }
            int n = Integer.parseInt(line);
            for (int i = 1; i <= n; i++) {
                if (i != n) {
                    out.write((i + " ").getBytes());
                } else {
                    out.write((i + "\n").getBytes());
                }
            }
        }
        out.flush();
    }

}
