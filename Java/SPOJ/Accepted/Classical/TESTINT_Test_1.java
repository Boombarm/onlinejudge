package SPOJ.Accepted.Classical;
/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: Sphere Online Judge
 * @Categories: basics
 * @Problem: TESTINT - Test 1
 * @Link: http://www.spoj.com/problems/basics/
 * @Timelimit: 1 sec
 * @Status: accepted
 * @Memory: 4468M
 * @Submission: 2018-04-02 10:39:53
 * @Runtime: 0.12
 * @Solution:
 * @Note:
 */
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TESTINT_Test_1 {

    int A, B;

    public TESTINT_Test_1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedOutputStream bos = new BufferedOutputStream(System.out);
        String input;
        while ((input = br.readLine()) != null) {
            A = Integer.parseInt(input);
            B = Integer.parseInt(br.readLine());
            bos.write(((A + B) + "\n").getBytes());
        }
        bos.flush();
    }

}
