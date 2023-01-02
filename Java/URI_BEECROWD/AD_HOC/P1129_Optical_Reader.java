package  URI.Accepted.AD_HOC.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1129 Optical Reader https://www.urionlinejudge.com.br/judge/en/problems/view/1129
//Accepted 05/10/2015 - 06:56:38 Runtime:0.072s
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1129_Optical_Reader {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            for (int i = 0; i < n; i++) {
                String[] s = br.readLine().split(" ");
                int found = 0;
                int index = -1;
                for (int j = 0; j < s.length; j++) {
                    int num = Integer.parseInt(s[j]);
                    if (num < 128) {
                        if (found == 0) {
                            found++;
                            index = j;
                        } else {
                            found++;
                            break;
                        }
                    }
                }
                System.out.println(found == 1 ? (char) ('A' + index) : "*");
            }

        }

    }
}
