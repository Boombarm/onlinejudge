package URI.Accepted.AD_HOC.sourcecode;
/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: AD-HOC
 * @Problem: 2051 - Karnaugh Maps I
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2051
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory:
 * @Submission: 3/24/18, 4:53:35 PM
 * @Runtime: 0.048s
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

class P2051_Karnaugh_Maps_I {

    BufferedReader br;
    BufferedWriter bw;

    public P2051_Karnaugh_Maps_I() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            bw.append("Mapa de Karnaugh\n");
            int c = Integer.parseInt(br.readLine());
            int[][] table;
            String[] left_header;
            int count = 0;
            switch (c) {
                case 2:
                    table = new int[2][2];
                    for (int i = 0; i < 4; i++) {
                        String[] st = br.readLine().split(" - | ");
                        int x = Integer.parseInt(st[0]);
                        int y = Integer.parseInt(st[1]);
                        int v = Integer.parseInt(st[2]);
                        table[y][x] = v;
                    }
                    bw.append("  0 1\n");
                    left_header = new String[]{"0", "1"};
                    for (int i = 0; i < 2; i++) {
                        bw.append(left_header[i] + "|" + table[i][0] + " " + table[i][1] + "\n");
                        for (int j = 0; j < 2; j++) {
                            if (table[i][j] > 0) {
                                count++;
                            }
                        }
                    }
                    bw.append((count == 4 ? "Tautologia" : (count > 0 ? "Contingencia" : "Contradicao")) + "\n");
                    break;
                case 3:
                    table = new int[2][4];
                    for (int i = 0; i < 8; i++) {
                        String[] st = br.readLine().split(" - | ");
                        int x = Integer.parseInt(st[0]);
                        int y = Integer.parseInt(st[1]);
                        int z = Integer.parseInt(st[2]);
                        int v = Integer.parseInt(st[3]);

                        int index = 0;
                        if (x == 1) {
                            if (y == 1) {
                                index = 2;
                            } else {
                                index = 3;
                            }
                        } else if (y == 1) {
                            index = 1;
                        }

                        table[z][index] = v;
                    }
                    bw.append("  00 01 11 10\n");
                    left_header = new String[]{"0", "1"};

                    for (int i = 0; i < 2; i++) {
                        bw.append(left_header[i] + "|" + table[i][0] + "  " + table[i][1] + "  " + table[i][2] + "  " + table[i][3] + "\n");
                        for (int j = 0; j < 4; j++) {
                            if (table[i][j] > 0) {
                                count++;
                            }
                        }
                    }
                    bw.append((count == 8 ? "Tautologia" : (count > 0 ? "Contingencia" : "Contradicao")) + "\n");
                    break;
                case 4:
                    table = new int[4][4];
                    for (int i = 0; i < 16; i++) {
                        String[] st = br.readLine().split(" - | ");
                        int x1 = Integer.parseInt(st[0]);
                        int y1 = Integer.parseInt(st[1]);
                        int x2 = Integer.parseInt(st[2]);
                        int y2 = Integer.parseInt(st[3]);
                        int v = Integer.parseInt(st[4]);
                        int index1 = 0;
                        int index2 = 0;

                        if (x1 == 1) {
                            if (y1 == 1) {
                                index1 = 2;
                            } else {
                                index1 = 3;
                            }
                        } else if (y1 == 1) {
                            index1 = 1;
                        }

                        if (x2 == 1) {
                            if (y2 == 1) {
                                index2 = 2;
                            } else {
                                index2 = 3;
                            }
                        } else if (y2 == 1) {
                            index2 = 1;
                        }

                        table[index2][index1] = v;
                    }
                    bw.append("   00 01 11 10\n");
                    left_header = new String[]{"00", "01", "11", "10"};
                    for (int i = 0; i < 4; i++) {
                        bw.append(left_header[i] + "|" + table[i][0] + "  " + table[i][1] + "  " + table[i][2] + "  " + table[i][3] + "\n");
                        for (int j = 0; j < 4; j++) {
                            if (table[i][j] > 0) {
                                count++;
                            }
                        }
                    }
                    bw.append((count == 16 ? "Tautologia" : (count > 0 ? "Contingencia" : "Contradicao")) + "\n");
                    break;
            }
            if (t > 0) {
                bw.newLine();
            }
        }
        bw.flush();
    }

}
