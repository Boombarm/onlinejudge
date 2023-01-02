/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: Beginner
 * @Problem: 2493 Jogo do Operador
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2493
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 1/14/17, 5:57:50 PM
 * @Runtime: 0.072s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class P2493_Jogo_do_Operador {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (sc.hasNext()) {
            int n = Integer.parseInt(sc.next());
            int[] operation1 = new int[n];
            int[] operation2 = new int[n];
            int[] resultArr = new int[n];
            for (int i = 0; i < n; i++) {
                operation1[i] = sc.nextInt();
                String[] s = sc.next().split("=");
                operation2[i] = Integer.parseInt(s[0]);
                resultArr[i] = Integer.parseInt(s[1]);
            }
            int wrong = 0;
            LinkedList<String> names = new LinkedList<String>();
            for (int i = 0; i < n; i++) {
                String name = sc.next();
                int expression = Integer.parseInt(sc.next()) - 1;
                int ope1 = operation1[expression];
                int ope2 = operation2[expression];
                int result = resultArr[expression];
                boolean w = false;
                String answer = sc.next();
                if (answer.equals("+")) {
                    if (!(ope1 + ope2 == result)) {
                        w = true;
                    }

                } else if (answer.equals("-")) {
                    if (!(ope1 - ope2 == result)) {
                        w = true;
                    }

                } else if (answer.equals("*")) {
                    if (!(ope1 * ope2 == result)) {
                        w = true;
                    }

                } else if (answer.equals("I")) {
                    if ((ope1 + ope2 == result)
                            || (ope1 - ope2 == result)
                            || (ope1 * ope2 == result)) {
                        w = true;
                    }

                }
                if (w) {
                    wrong++;
                    names.add(name);
                }
            }
            if (wrong == 0) {
                bw.append("You Shall All Pass!\n");
            } else if (wrong == n) {
                bw.append("None Shall Pass!\n");
            } else {
                Collections.sort(names, new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o1.compareTo(o2);
                    }
                });
                boolean hasWrong = false;
                for (String s : names) {
                    if (hasWrong) {
                        bw.append(" " + s);
                    } else {
                        bw.append(s);
                        hasWrong = true;
                    }
                }
                bw.newLine();

            }
        }
        bw.flush();
    }
}
