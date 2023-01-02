/*
@Online Judge: URI Online Judge
@Problem No: 2682
@Problem Name: Fault Detector
@ProblemLink: https://www.urionlinejudge.com.br/judge/en/problems/view/2682
@Status: Accepted
@Runtime: 0.052s 
@Submission: 9/23/17, 1:14:07 PM
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2682_Fault_Detector {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int x = Integer.parseInt(input);
        int nextNumber = x + 1;
        boolean on = true;
        while ((input = br.readLine()) != null) {
            if (on) {
                x = Integer.parseInt(input);
                if (x >= nextNumber) {
                    nextNumber = x + 1;
                } else {
                    on = false;
                }
            }
        }
        System.out.println(nextNumber);
    }
}
