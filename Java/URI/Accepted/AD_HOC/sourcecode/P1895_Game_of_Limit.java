package  URI.Accepted.AD_HOC.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1895 Game of Limit https://www.urionlinejudge.com.br/judge/en/problems/view/1895
//Accepted 08/10/2015 - 13:38:59 Runtime:0.048s
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1895_Game_of_Limit {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] limitCase = br.readLine().split(" ");
        int n = Integer.parseInt(limitCase[0]);
        int t = Integer.parseInt(limitCase[1]);
        int l = Integer.parseInt(limitCase[2]);

        int aliceScore = 0, bobScore = 0;
        for (int i = 0; i < n - 1; i++) {
            int s = Integer.parseInt(br.readLine());
            if (s >= 1 && s <= n) {
                int nowTern = Math.abs(t - s);
                if (nowTern <= l) {
                    if (i % 2 == 0) {
                        aliceScore += nowTern;
                    } else {
                        bobScore += nowTern;
                    }
                    t = s;
                }
            }
        }
        System.out.println(aliceScore + " " + bobScore);

    }
}
