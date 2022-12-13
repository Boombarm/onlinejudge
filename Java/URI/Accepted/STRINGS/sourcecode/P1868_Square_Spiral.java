/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1868 Square Spiral
 * @Timelimit: 1 sec
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1868
 * @Status: Accepted 09/10/2015 - 11:10:41 Runtime:0.116s
 * @Solution:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class P1868_Square_Spiral {

    static final char LEFT = 'L', RIGHT = 'R', TOP = 'T', BOTTOM = 'B';
    static char direction;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> input = new ArrayList<Integer>();
        boolean run = true;
        String line = "";
        while (true) {
            line = br.readLine();
            if (!line.isEmpty()) {
                if (line.equals("0")) {
                    break;
                }
                int n = Integer.parseInt(line);
                if (n % 2 == 0) {
                    run = false;
                    break;
                }
                input.add(n);
            }
        }
        br.close();

        if (run) {
            for (int i = 0; i < input.size(); i++) {
                int n = input.get(i);
                int r = n / 2, c = n / 2;
                direction = RIGHT;
                int count = 0, limit = 1;

                for (int j = 0; j < n * n; j++) {
                    for (int k = 0; k < n; k++) {
                        for (int l = 0; l < n; l++) {
                            if (k == r && l == c) {
                                bw.write("X");
                            } else {
                                bw.write("O");
                            }
                        }
                        bw.write("\n");
                    }
                    bw.write("@\n");
                    bw.flush();

                    if (direction == RIGHT) {
                        c++;
                        count++;
                        if (count == limit) {
                            count = 0;
                            direction = TOP;
                        }
                    } else if (direction == TOP) {
                        r--;
                        count++;
                        if (count == limit) {
                            count = 0;
                            limit += 1;
                            direction = LEFT;
                        }
                    } else if (direction == LEFT) {
                        c--;
                        count++;
                        if (count == limit) {
                            count = 0;
                            direction = BOTTOM;
                        }
                    } else if (direction == BOTTOM) {
                        r++;
                        count++;
                        if (count == limit) {
                            count = 0;
                            limit += 1;
                            direction = RIGHT;
                        }
                    }

                }

            }
            bw.close();
        }

    }
}
