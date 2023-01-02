package  URI.Accepted.AD_HOC.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1250 KiloMan https://www.urionlinejudge.com.br/judge/problems/view/1250/rate:1250/rating:1
//Accepted 13/10/2015 - 12:37:52 Runtime:0.104s
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1250_KiloMan {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int answer = 0;
            int shots = Integer.parseInt(br.readLine());
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            char[] character = br.readLine().toCharArray();
            for (int j = 0; j < shots; j++) {
                int height = Integer.parseInt(st1.nextToken());
                if (character[j] == 'S' && (height <= 2)) {
                    answer++;
                } else if (character[j] == 'J' && height > 2) {
                    answer++;
                }
            }
            System.out.println(answer);
        }
    }
}
