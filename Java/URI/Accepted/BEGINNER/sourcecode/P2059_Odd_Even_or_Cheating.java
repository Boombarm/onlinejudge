/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2059 Odd, Even or Cheating
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2059
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 6/4/16, 2:53:48 AM
 * @Runtime: 0.044s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2059_Odd_Even_or_Cheating {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int p = Integer.parseInt(input[0]);
        int j1 = Integer.parseInt(input[1]);
        int j2 = Integer.parseInt(input[2]);
        int r = Integer.parseInt(input[3]);
        int a = Integer.parseInt(input[4]);
        if (a == 0) {
            if (r == 0) {
                if (p == 1) {
                    System.out.println(((j1 + j2) % 2) == 0 ? "Jogador 1 ganha!" : "Jogador 2 ganha!");
                } else {
                    System.out.println(((j1 + j2) % 2) == 0 ? "Jogador 2 ganha!" : "Jogador 1 ganha!");
                }
            } else {
                System.out.println("Jogador 1 ganha!");
            }
        } else if (a == 1) {
            if (r == 0) {
                System.out.println("Jogador 1 ganha!");
            } else {
                System.out.println("Jogador 2 ganha!");
            }
        }

    }

}
