/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1063 Rails Again... Tracing Movements
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1063
 * @Timelimit: 1 sec
 * @Status: Accepted 19/11/2015 - 09:21:59 Runtime:0.132s
 * @Solution:Stack
 */
package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.StringTokenizer;

public class P1063_Rails_Again_Tracing_Movements {

    static char[] station;
    static int top;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        int n;
        while ((n = Integer.parseInt(br.readLine())) != 0) {
            StringTokenizer stk1 = new StringTokenizer(br.readLine());
            String outputSequence = br.readLine();
            StringTokenizer stk2 = new StringTokenizer(outputSequence);
            station = new char[n];
            top = -1;
            char[] a = new char[n];
            char[] b = new char[n];
            char now = stk2.nextToken().charAt(0);
            int index = 0;
            for (int i = 0; stk1.hasMoreTokens(); i++) {
                push(stk1.nextToken().charAt(0));
                out.write("I".getBytes());
                while (!stationIsEmpty() && now == station[top]) {
                    b[index] = pop();
                    index++;
                    out.write("R".getBytes());
                    if (stk2.hasMoreTokens()) {
                        now = stk2.nextToken().charAt(0);
                    }
                }
            }
            boolean isImpossible = false;
            stk2 = new StringTokenizer(outputSequence);
            for (int i = 0; i < b.length; i++) {
                if (stk2.nextToken().charAt(0) != b[i]) {
                    isImpossible = true;
                    break;
                }
            }
            if (isImpossible) {
                out.write(" Impossible".getBytes());
            }

            out.write("\n".getBytes());
        }
        out.flush();
    }

    static void push(char wagon) {
        top++;
        station[top] = wagon;
    }

    static char pop() {
        char pop = station[top];
        top--;
        return pop;
    }

    static boolean stationIsEmpty() {
        return top == -1;
    }
}
