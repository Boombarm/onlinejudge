/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1342 Dice
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1342
 * @Timelimit: 1 sec
 * @Status: Accepted 02/11/2015 - 10:40:33 Runtime:0.076s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P1342_Dice {

    static class Player {

        int place = 0;
        boolean TRAPPED = false;
    }
    static int trap1, trap2, trap3;
    static int end;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        String line = "";
        while (!(line = br.readLine()).equals("0 0")) {
            String[] st = line.split(" ");
            int totalPlayer = Integer.parseInt(st[0]);
            int trail = Integer.parseInt(st[1]);
            end = trail + 1;
            Player[] player = new Player[totalPlayer];
            for (int i = 0; i < totalPlayer; i++) {
                player[i] = new Player();
            }
            st = br.readLine().split(" ");
            trap1 = Integer.parseInt(st[0]);
            trap2 = Integer.parseInt(st[1]);
            trap3 = Integer.parseInt(st[2]);
            int totalRoll = Integer.parseInt(br.readLine());
            int round = 0;
            for (int i = 0; i < totalRoll; i++) {
                st = br.readLine().split(" ");
                int dice1 = Integer.parseInt(st[0]);
                int dice2 = Integer.parseInt(st[1]);
                int move = (dice1 + dice2);

                while (player[round % totalPlayer].TRAPPED) {
                    player[round % totalPlayer].TRAPPED = false;
                    round++;
                }
                player[round % totalPlayer].place += move;

                if (isTrapped(player[round % totalPlayer].place)) {
                    player[round % totalPlayer].TRAPPED = true;
                }

                if (player[round % totalPlayer].place >= end) {
                    out.write((((round % totalPlayer) + 1) + "\n").getBytes());
                }
                round++;
            }
        }
        out.flush();
    }

    static boolean isTrapped(int place) {
        return place == trap1 || place == trap2 || place == trap3;
    }

}
