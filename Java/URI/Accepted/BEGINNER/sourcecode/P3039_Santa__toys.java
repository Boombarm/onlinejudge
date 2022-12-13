package URI.Accepted.BEGINNER.sourcecode;


import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P3039_Santa__toys {

    static int M = 0, F = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] st = br.readLine().split(" ");
            String t = st[1];
            if (t.equals("M")) {
                M++;
            } else {
                F++;
            }
        }
        System.out.println(M + " carrinhos");
        System.out.println(F + " bonecas");
    }
}
