/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1258 T-Shirts
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1258
 * @Timelimit: 1 sec
 * @Status: Accepted 09/11/2015 - 08:38:50 Runtime:0.144s
 * @Solution:
 */
package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class P1258_T_Shirts {

    static ArrayList[] white = new ArrayList[3];
    static ArrayList[] red = new ArrayList[3];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        while (n != 0) {
            for (int i = 0; i < n; i++) {
                String studentName = br.readLine();
                String[] st = br.readLine().split(" ");
                String color = st[0];
                String size = st[1];
                if (color.equals("branco")) {
                    if (size.equals("P")) {
                        if (white[0] == null) {
                            white[0] = new ArrayList<String>();
                        }
                        white[0].add(studentName);
                    } else if (size.equals("M")) {
                        if (white[1] == null) {
                            white[1] = new ArrayList<String>();
                        }
                        white[1].add(studentName);
                    } else {
                        if (white[2] == null) {
                            white[2] = new ArrayList<String>();
                        }
                        white[2].add(studentName);
                    }
                } else {
                    if (size.equals("P")) {
                        if (red[0] == null) {
                            red[0] = new ArrayList<String>();
                        }
                        red[0].add(studentName);
                    } else if (size.equals("M")) {
                        if (red[1] == null) {
                            red[1] = new ArrayList<String>();
                        }
                        red[1].add(studentName);
                    } else {
                        if (red[2] == null) {
                            red[2] = new ArrayList<String>();
                        }
                        red[2].add(studentName);
                    }
                }
            }

            String size = "";
            for (int i = 0; i < white.length; i++) {
                if (white[i] != null) {
                    Collections.sort(white[i]);
                    switch (i) {
                        case 0:
                            size = "P";
                            break;
                        case 1:
                            size = "M";
                            break;
                        case 2:
                            size = "G";
                            break;
                    }
                    for (int j = 0; j < white[i].size(); j++) {
                        bw.write("branco " + size + " " + white[i].get(j) + "\n");
                    }
                    white[i].clear();
                }
            }

            for (int i = 0; i < red.length; i++) {
                if (red[i] != null) {
                    Collections.sort(red[i]);
                    switch (i) {
                        case 0:
                            size = "P";
                            break;
                        case 1:
                            size = "M";
                            break;
                        case 2:
                            size = "G";
                            break;
                    }
                    for (int j = 0; j < red[i].size(); j++) {
                        bw.write("vermelho " + size + " " + red[i].get(j) + "\n");
                    }
                    red[i].clear();
                }
            }
            n = Integer.parseInt(br.readLine());
            if (n != 0) {
                bw.newLine();
            }
            bw.flush();
        }
    }

}
