package  URI.Accepted.AD_HOC.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1547 Guess What https://www.urionlinejudge.com.br/judge/en/problems/view/1547
//Accepted 03/10/2015 - 00:25:09 Runtime:0.224s
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1547_Guess_What {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int groupAmount = Integer.parseInt(st.nextToken());
            int teacherNumber = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int answer = 0;
            int less = Integer.MAX_VALUE;
            for (int j = 1; j <= groupAmount; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (num == teacherNumber) {
                    answer = j;
                    break;
                } else {
                    int c = Math.abs(teacherNumber - num);
                    if (less > c) {
                        less = c;
                        answer = j;
                    }
                }
            }
            System.out.println(answer);
        }
    }

}
