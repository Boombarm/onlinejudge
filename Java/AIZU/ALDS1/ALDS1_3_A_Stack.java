package AIZU.Accepted.ALDS1;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: AIZU ONLINE JUDGE
 * @Categories:
 * @Problem: ALDS1_3_A: Stack
 * @Link: http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_3_A
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory: 24256 KB
 * @Submission: 2018-03-08 15:11
 * @Runtime: 00:05 s
 * @Solution: stack Calculator (Reverse Polish notation -> https://en.wikipedia.org/wiki/Reverse_Polish_notation )
 * @Note:
 */

import java.io.*;

public class ALDS1_3_A_Stack {

    public static void main(String a[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int[]  stack = new int[input.length];
        int top = -1;
        int op1, op2;
        for (String i : input) {
            switch (i) {
                case "-":
                    op1 = stack[top];
                    stack[top--] = 0;
                    op2 = stack[top];
                    stack[top--] = 0;
                    stack[++top] = op2 - op1 ;
                    break;
                case "+":
                    op1 = stack[top];
                    stack[top--] = 0;
                    op2 = stack[top];
                    stack[top--] = 0;
                    stack[++top] = op2 + op1;
                    break;
                case "/":
                    op1 = stack[top];
                    stack[top--] = 0;
                    op2 = stack[top];
                    stack[top--] = 0;
                    stack[++top] = op2 / op1;
                    break;
                case "*":
                    op1 = stack[top];
                    stack[top--] = 0;
                    op2 = stack[top];
                    stack[top--] = 0;
                    stack[++top] = op2 * op1;
                    break;
                default:
                    stack[++top] = Integer.parseInt(i);
                    break;
            }
        }
        bw.append(stack[0] + "\n");
        bw.flush();
    }

}
