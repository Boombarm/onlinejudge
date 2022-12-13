/*
@Online Judge: 
@Problem No: 2679
@Problem Name: Even Successor
@ProblemLink: https://www.urionlinejudge.com.br/judge/en/problems/view/2679
@Status: Accepted
@Runtime: 0.068s
@Submission: 9/22/17, 2:16:40 PM
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2679_Even_Successor {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        System.out.println(x % 2 == 0 ? x + 2 : x + 1);
    }
}
