package URI.Accepted.BEGINNER.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: BEGINNER
 * @Problem: 2760 String Input and Output
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2760
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory:
 * @Submission: 10/20/18, 10:11:55 PM
 * @Runtime: 0.088s
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P2760_String_Input_and_Output {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String var1 = br.readLine();
        String var2 = br.readLine();
        String var3 = br.readLine();
        System.out.println(var1 + var2 + var3);
        System.out.println(var2 + var3 + var1);
        System.out.println(var3 + var1 + var2);
        System.out.print(var1.length() > 10 ? var1.substring(0, 10) : var1);
        System.out.print(var2.length() > 10 ? var2.substring(0, 10) : var2);
        System.out.print(var3.length() > 10 ? var3.substring(0, 10) : var3);
        System.out.println();
    }
}
