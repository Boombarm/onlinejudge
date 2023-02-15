/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1062 Rails
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1062
 * @Timelimit: 1 sec
 * @Status: Accepted 19/11/2015 - 07:14:15 Runtime:0.112s
 * @Solution: 
 */
package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.StringTokenizer;

public class P1062_Rails {

    static int[] station;
    static int top;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        int n;
        while ((n = Integer.parseInt(br.readLine())) != 0) {
            String line = "";
            while (!(line = br.readLine()).equals("0")) {
                station = new int[n];
                top = -1;
                int[] a = new int[n];
                int head = n;
                StringTokenizer stk = new StringTokenizer(line);
                for (int i = 0; stk.hasMoreTokens(); i++) {
                    a[i] = Integer.parseInt(stk.nextToken());
                }
                int j = 0;
                for (int i = n - 1; i >= 0; i--) {
                    if (a[i] == head) {
                        head--;
                        j++;
                    } else {
                        push(a[i]);
                    }

                    while (!stationIsEmpty() && station[top] == head) {
                        pop();
                        j++;
                        head--;
                    }
                }

                if (stationIsEmpty()) {
                    out.write("Yes\n".getBytes());
                } else {
                    out.write("No\n".getBytes());
                }

            }
            out.write("\n".getBytes());
        }
        out.flush();
    }

    static void push(int coach) {
        top++;
        station[top] = coach;
    }

    static int pop() {
        int pop = station[top];
        top--;
        return pop;
    }

    static boolean stationIsEmpty() {
        return top == -1;
    }

}

//    static void printStack() {
//        for (int i = 0; i <= top; i++) {
//            System.out.print(station[i] + " ");
//        }
//    }
//
//                        System.out.println("A: ");
//                        for (int k = 0; k < b.length; k++) {
//                            System.out.print(a[k] + " ");
//                        }
//                        System.out.print("\nStation: ");
//                        printStack();
//                        System.out.print("\nB: ");
//                        for (int k = 0; k < b.length; k++) {
//                            System.out.print(b[k] + " ");
//                        }
//                        System.out.println("");
