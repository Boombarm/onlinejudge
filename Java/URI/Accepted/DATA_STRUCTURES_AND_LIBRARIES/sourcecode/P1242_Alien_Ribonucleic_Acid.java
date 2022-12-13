/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1242 Alien Ribonucleic Acid
 * @Link: https://www.urionlinejudge.com.br/judge/problems/view/1242/rate:1242/rating:3
 * @Timelimit: 1 sec
 * @Status: Accepted 23/11/2015 - 11:47:57 Runtime:0.052s
 * @Solution: stack mapping C pairs with F, F pairs with C, S pairs with B, B pairs with S
 */
package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P1242_Alien_Ribonucleic_Acid {

    static char[] stack;
    static int top;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        String input;
        while ((input = br.readLine()) != null) {
            int n = input.length();
            stack = new char[n];
            top = -1;
            push(input.charAt(0));
            int answer = 0;
            for (int i = 1; i < n; i++) {
                char now = input.charAt(i);
                if (!stackIsEmpty()
                        && (now == 'C' && stack[top] == 'F'
                        || now == 'F' && stack[top] == 'C'
                        || now == 'B' && stack[top] == 'S'
                        || now == 'S' && stack[top] == 'B')) {
                    pop();
                    answer++;
                } else {
                    push(now);
                }
            }
            out.write((answer + "\n").getBytes());
        }
        out.flush();
    }

    static void push(char ribonucleic) {
        top++;
        stack[top] = ribonucleic;
    }

    static void pop() {
        top--;
    }

    static boolean stackIsEmpty() {
        return top == -1;
    }

}
