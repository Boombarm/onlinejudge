/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2310 Volleyball
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2310
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 12/16/16, 11:40:48 PM
 * @Runtime: 0.048s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class P2310_Volleyball {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat formatter = new DecimalFormat("0.00");
        int n = Integer.parseInt(br.readLine());
        int totalService = 0, totalBlock = 0, totalAttack = 0;
        int successService = 0, successBlock = 0, successAttack = 0;
        while (n-- > 0) {
            br.readLine();
            String[] st = br.readLine().split(" ");
            String[] st2 = br.readLine().split(" ");
            totalService += Integer.parseInt(st[0]);
            totalBlock += Integer.parseInt(st[1]);
            totalAttack += Integer.parseInt(st[2]);
            successService += Integer.parseInt(st2[0]);
            successBlock += Integer.parseInt(st2[1]);
            successAttack += Integer.parseInt(st2[2]);
        }

        double percenService = (successService * 100.00) / totalService;
        double percenBlock = (successBlock * 100.00) / totalBlock;
        double percenAttack = (successAttack * 100.00) / totalAttack;
        System.out.println("Pontos de Saque: " + formatter.format(percenService) + " %.");
        System.out.println("Pontos de Bloqueio: " + formatter.format(percenBlock) + " %.");
        System.out.println("Pontos de Ataque: " + formatter.format(percenAttack) + " %.");
    }

}
