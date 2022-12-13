package th.in.devboom.uri.accepted;

/**
 * Created by Teerapat-BSD on 1/10/2018.
 * https://www.urionlinejudge.com.br/judge/en/problems/view/2702
 * Runtime: 0.032s
 * Submission: 1/10/18, 2:13:40 PM
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2702_Hard_Choice {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in;
        in = br.readLine().split(" ");
        int ca = Integer.parseInt(in[0]);
        int ba = Integer.parseInt(in[1]);
        int pa = Integer.parseInt(in[2]);
        in = br.readLine().split(" ");
        int cb = Integer.parseInt(in[0]);
        int bb = Integer.parseInt(in[1]);
        int pb = Integer.parseInt(in[2]);
        int answer = (cb > ca ? cb - ca : 0) + (bb > ba ? bb - ba : 0) + (pb > pa ? pb - pa : 0);
        System.out.println(answer);
    }

}
