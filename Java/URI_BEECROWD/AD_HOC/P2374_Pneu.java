package URI.Accepted.AD_HOC.sourcecode;

/**
 * Created by Teerapat-BSD on 1/29/2018.
 * Answer : Accepted
 * Submission : 1/29/18, 2:42:16 PM
 * Runtime : 0.032s
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2374_Pneu {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        System.out.println(a - b);
    }
}
