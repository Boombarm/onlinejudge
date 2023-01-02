package SPOJ.Accepted.basics;
/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: Sphere Online Judge
 * @Categories: basics
 * @Problem: EXPECT - Life, the Universe, and Everything (Interactive)
 * @Link: http://www.spoj.com/problems/EXPECT/
 * @Timelimit: 1 sec
 * @Status: accepted
 * @Memory: 4468M
 * @Submission: 2018-04-02 11:00:53
 * @Runtime: 0.04
 * @Solution:
 * @Note:
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TEST_Life_the_Universe_and_Everything {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        do {
            input = br.readLine();
            System.out.println(input);
        }
        while (!(input).equals("42"));
    }

}
