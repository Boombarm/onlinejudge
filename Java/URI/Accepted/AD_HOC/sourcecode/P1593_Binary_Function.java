package  URI.Accepted.AD_HOC.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1593 Binary Function https://www.urionlinejudge.com.br/judge/en/problems/view/1593
//Accepted 11/10/2015 - 10:20:04 Runtime:0.060s
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P1593_Binary_Function {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int c = 0;
        while (c != n) {
            String s = br.readLine();
            if (s.isEmpty()) {
                continue;
            }
            int answer = 0;
            String binary = new BigInteger(s).toString(2);
            for (int i = 0; i < binary.length(); i++) {
                if (binary.charAt(i) == '1') {
                    answer++;
                }
            }
            System.out.println(answer);
            c++;
        }
    }
}
