/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1272 Hidden Message
 * @Timelimit: 1 sec
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1272
 * @Status: Accepted 29/09/2015 - 01:29:54 Runtime:0.244s
 * @Solution:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P1272_Hidden_Message {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String text = br.readLine();
            Pattern p = Pattern.compile("[a-z]+");
            Matcher m = p.matcher(text);
            while (m.find()) {
                System.out.print(m.group().charAt(0));
            }
            System.out.println("");
        }
    }

}
