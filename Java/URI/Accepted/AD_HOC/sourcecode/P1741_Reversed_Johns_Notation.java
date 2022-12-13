/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1741 Reversed John’s Notation
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1741
 * @Timelimit: 1 sec
 * @Status: Accepted 04/11/2015 - 09:22:27 Runtime:0.644s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
public class P1741_Reversed_Johns_Notation {
 
    static long[] stack;
    static int top;
    static long operand1 = 0, operand2 = 0, result = 0;
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = "";
        while ((input = br.readLine()) != null) {
            if (input.isEmpty()) {
                bw.append("Invalid expression.\n");
                continue;
            }
            char[] expression = input.replace(" ", "").toCharArray();
            stack = new long[expression.length];
            top = -1;
            boolean inValid = false;
            boolean isDivisionbyZero = false;
            for (int i = expression.length - 1; i >= 0; i--) {
                if (Character.isDigit(expression[i])) {
                    push(Character.getNumericValue(expression[i]));
                } else {
                    if (isEmpty()) {
                        inValid = true;
                        break;
                    }
                    operand2 = pop();
                    if (isEmpty()) {
                        inValid = true;
                        break;
                    }
                    operand1 = pop();
                    if (expression[i] == '+') {
                        result = operand1 + operand2;
                    } else if (expression[i] == '-') {
                        result = operand1 - operand2;
                    } else if (expression[i] == '*') {
                        result = operand1 * operand2;
                    } else if (expression[i] == '/') {
                        try {
                            result = operand1 / operand2;
                        } catch (java.lang.ArithmeticException e) {
                            isDivisionbyZero = true;
                        }
                    } else {
                        inValid = true;
                        break;
                    }
                    push(result);
                }
            }
            if (inValid || top > 0) {
                bw.append("Invalid expression.\n");
            } else if (isDivisionbyZero) {
                bw.append("Division by zero.\n");
            } else {
                bw.append("The answer is " + pop() + ".\n");
            }
        }
        bw.flush();
    }
 
    static void push(long digit) {
        top++;
        stack[top] = digit;
    }
 
    static long pop() {
        long topDigit = stack[top];
        top--;
        return topDigit;
    }
 
    static boolean isEmpty() {
        return top == -1;
    }
 
}