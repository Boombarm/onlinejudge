/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2031 Rock, Paper, Airstrike
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2031
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 4/1/16, 4:57:50 PM
 * @Runtime: 0.048s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2031_Rock_Paper_Airstrike {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String player1 = br.readLine();
            String player2 = br.readLine();
            if (player1.equals("pedra")) {
                if (player2.equals("pedra")) {
                    bw.append("Sem ganhador");

                } else if (player2.equals("ataque")) {
                    bw.append("Jogador 2 venceu");

                } else if (player2.equals("papel")) {
                    bw.append("Jogador 1 venceu");

                }

            } else if (player1.equals("papel")) {
                if (player2.equals("papel")) {
                    bw.append("Ambos venceram");

                } else if (player2.equals("pedra")) {
                    bw.append("Jogador 2 venceu");

                } else if (player2.equals("ataque")) {
                    bw.append("Jogador 2 venceu");

                }

            } else if (player1.equals("ataque")) {
                if (player2.equals("ataque")) {
                    bw.append("Aniquilacao mutua");

                } else if (player2.equals("papel")) {
                    bw.append("Jogador 1 venceu");

                } else if (player2.equals("pedra")) {
                    bw.append("Jogador 1 venceu");

                }

            }
            bw.newLine();
        }

        bw.flush();
    }

}
