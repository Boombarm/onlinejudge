/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1121 Sticker Collector Robot
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1121
 * @Timelimit: 1 sec
 * @Status: Accepted 2/9/16, 8:26:43 PM Runtime: 0.064 
 * @Solution:
 * @Note:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P1121_Sticker_Collector_Robot {

    private static char[][] map;
    private static char[] commands;
    private static int n, m, s;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        String input;
        while (!(input = br.readLine()).equals("0 0 0")) {
            String[] st = input.split(" ");
            n = Integer.parseInt(st[0]);
            m = Integer.parseInt(st[1]);
            s = Integer.parseInt(st[2]);
            map = new char[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = br.readLine().toCharArray();
            }
            commands = br.readLine().toCharArray();
            int row = 0, colum = 0;
            char direction = ' ';
            //find StartIndex and direction of robot
            loop:
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    switch (map[i][j]) {
                        case 'N':
                            row = i;
                            colum = j;
                            direction = 'N';//North
                            break loop;
                        case 'S':
                            row = i;
                            colum = j;
                            direction = 'S';//South
                            break loop;
                        case 'L':
                            row = i;
                            colum = j;
                            direction = 'L';//East
                            break loop;
                        case 'O':
                            row = i;
                            colum = j;
                            direction = 'O';//West
                            break loop;
                    }
                }
            }
            out.write((simulation(commands, row, colum, direction) + "\n").getBytes());
            out.flush();
        }
        out.flush();
    }

    private static int simulation(char[] commands, int row, int colum, char direction) {
        int sticker = 0;
        int instuction = 0;
        outerLoop:
        do {
            char command = commands[instuction];
            switch (command) {
                case 'F':
                    switch (direction) {
                        case 'N'://Robot Direction = North
                            if ((row - 1) > -1 && map[row - 1][colum] != '#') {
                                //Move North Direction 1 cell
                                row--;
                            }
                            break;
                        case 'S'://Robot Direction = South
                            if ((row + 1) < n && map[row + 1][colum] != '#') {
                                //Move South Direction 1 cell
                                row++;
                            }
                            break;
                        case 'O'://Robot Direction = West
                            if ((colum - 1) > -1 && map[row][colum - 1] != '#') {
                                //Move West Direction 1 cell
                                colum--;
                            }
                            break;
                        case 'L'://Robot Direction = East
                            if ((colum + 1) < m && map[row][colum + 1] != '#') {
                                //Move East Direction 1 cell
                                colum++;
                            }
                            break;
                    }
                    break;
                case 'D'://turn 90 degrees to the right
                    switch (direction) {
                        case 'N'://Robot Direction = North
                            direction = 'L';//change Direction = East
                            break;
                        case 'S'://Robot Direction = South
                            direction = 'O';//change Direction = West
                            break;
                        case 'L'://Robot Direction = East
                            direction = 'S';//change Direction = South
                            break;
                        case 'O'://Robot Direction = West
                            direction = 'N';//change Direction = North
                            break;
                    }
                    break;
                case 'E'://turn 90 degrees to the left
                    switch (direction) {
                        case 'N'://Robot Direction = North
                            direction = 'O';//change Direction = West
                            break;
                        case 'S'://Robot Direction = South
                            direction = 'L';//change Direction = East
                            break;
                        case 'L'://Robot Direction = East
                            direction = 'N';//change Direction = North
                            break;
                        case 'O'://Robot Direction = West
                            direction = 'S';//change Direction = South
                            break;
                    }
                    break;
            }
            if (map[row][colum] == '*') {
                map[row][colum] = '.';
                sticker++;
            }

        } while (++instuction < s);

        return sticker;
    }

}
