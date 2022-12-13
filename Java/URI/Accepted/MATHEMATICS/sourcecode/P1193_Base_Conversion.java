package URI.Accepted.MATHEMATICS.sourcecode;


/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: AD-HOC
 * @Problem: 1193 Base Conversion
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1193
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory:
 * @Submission: 13/10/2015 - 09:22:10
 * @Runtime: 0.364s
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1193_Base_Conversion {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Case " + (i + 1) + ":");
            String[] st = br.readLine().split(" ");
            if (st[1].equals("bin")) {
                String dec = Long.toString(Long.parseLong(st[0], 2), 10);
                String hex = Long.toString(Long.parseLong(st[0], 2), 16);
                System.out.println(dec + " dec");
                System.out.println(hex + " hex");
            } else if (st[1].equals("dec")) {
                String hex = Long.toString(Long.parseLong(st[0], 10), 16);
                String binary = Long.toString(Long.parseLong(st[0], 10), 2);
                System.out.println(hex + " hex");
                System.out.println(binary + " bin");
            } else if (st[1].equals("hex")) {
                String dec = Long.toString(Long.parseLong(st[0], 16), 10);
                String binary = Long.toString(Long.parseLong(st[0], 16), 2);
                System.out.println(dec + " dec");
                System.out.println(binary + " bin");
            }
            System.out.println("");
        }
    }

}
