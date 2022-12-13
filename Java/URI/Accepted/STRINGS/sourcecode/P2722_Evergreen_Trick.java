package  URI.Accepted.STRINGS.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: String
 * @Problem: 2722 Evergreen Trick
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2722
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 1/29/18, 10:43:16 PM
 * @Runtime: 0.048s
 * @Solution:String building
 * @Note:
 */
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2722_Evergreen_Trick {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int limit = 2;
        while (n-- > 0) {
            String name = br.readLine();
            String surname = br.readLine();
            int nameSize = name.length();
            int surnmaeSize = surname.length();
            int i = 0, j = 0;

            String a = "";
            boolean next = true;
            while (next) {
                next = false;
                for (int count = 1; i < nameSize && count <= limit; i++, count++) {
                    a += name.charAt(i);
                }

                for (int count = 1; j < surnmaeSize && count <= limit; j++, count++) {
                    a += surname.charAt(j);
                }
                if (i < nameSize || j < surnmaeSize) {
                    next = true;
                }
            }
            bw.append(a + "\n");
        }
        bw.flush();
    }
}
