/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1083 LEXSIM - Sintatic and Lexical Avaliator
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1083
 * @Timelimit: 1 sec
 * @Status: Accepted 18/11/2015 - 07:45:48 Runtime:0.064s
 * @Solution:
 */
package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P1083_LEXSIM_Sintatic_and_Lexical_Avaliator {

    static char[] stack;
    static int top;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = "";
        while ((input = br.readLine()) != null) {
            if (isValidLexical(input)) {
                stack = new char[input.length()];
                top = -1;
                StringBuilder sb = new StringBuilder();
                boolean error = false;
                boolean isOperand = false, isOperator = false, isClose = false;
                for (int i = 0; i < input.length(); i++) {
                    char now = input.charAt(i);
                    if (now == '(') {
                        if (isOperator || i == 0) {
                            push(now);
                        } else {
                            error = true;
                            break;
                        }
                        isOperand = false;
                        isClose = false;
                    } else if (now == ')') {
                        while (stack[top] != '(') {
                            sb.append(pop());
                        }
                        pop();
                        isOperand = false;
                        isClose = true;
                    } else if (now == '^') {
                        if (isOperator || i == 0) {
                            error = true;
                            break;
                        } else {
                            while (!stackIsEmpty() && stack[top] == now) {
                                sb.append(pop());
                            }
                            push(now);
                            isOperand = false;
                            isOperator = true;
                            isClose = false;
                        }
                    } else if (now == '*' || now == '/') {
                        if (isOperator || i == 0) {
                            error = true;
                            break;
                        } else {
                            while (!stackIsEmpty() && (stack[top] == '*' || stack[top] == '/' || stack[top] == '^')) {
                                sb.append(pop());
                            }
                            push(now);
                            isOperand = false;
                            isOperator = true;
                            isClose = false;
                        }
                    } else if (now == '+' || now == '-') {
                        if (isOperator || i == 0) {
                            error = true;
                            break;
                        } else {
                            while (!stackIsEmpty() && (stack[top] == '+' || stack[top] == '-' || stack[top] == '*' || stack[top] == '/' || stack[top] == '^')) {
                                sb.append(pop());
                            }
                            push(now);
                            isOperand = false;
                            isOperator = true;
                            isClose = false;
                        }
                    } else if (now == '<' || now == '>' || now == '#' || now == '=') {
                        if (isOperator || i == 0) {
                            error = true;
                            break;
                        } else {
                            while (!stackIsEmpty() && (stack[top] == '<' || stack[top] == '>' || stack[top] == '#' || stack[top] == '='
                                    || stack[top] == '+' || stack[top] == '-' || stack[top] == '*' || stack[top] == '/' || stack[top] == '^')) {
                                sb.append(pop());
                            }
                            push(now);
                            isOperand = false;
                            isOperator = true;
                            isClose = false;
                        }
                    } else if (now == '.') {
                        if (isOperator || i == 0) {
                            error = true;
                            break;
                        } else {
                            while (!stackIsEmpty() && (stack[top] == '.' || stack[top] == '<' || stack[top] == '>' || stack[top] == '#' || stack[top] == '='
                                    || stack[top] == '+' || stack[top] == '-' || stack[top] == '*' || stack[top] == '/' || stack[top] == '^')) {
                                sb.append(pop());
                            }
                            push(now);
                            isOperand = false;
                            isOperator = true;
                            isClose = false;
                        }
                    } else if (now == '|') {
                        if (isOperator || i == 0) {
                            error = true;
                            break;
                        } else {
                            while (!stackIsEmpty() && (stack[top] == '|' || stack[top] == '.' || stack[top] == '<' || stack[top] == '>' || stack[top] == '#' || stack[top] == '='
                                    || stack[top] == '+' || stack[top] == '-' || stack[top] == '*' || stack[top] == '/' || stack[top] == '^')) {
                                sb.append(pop());
                            }
                            push(now);
                            isOperand = false;
                            isOperator = true;
                            isClose = false;
                        }
                    } else {
                        if (isOperand || isClose) {
                            error = true;
                            break;
                        } else {
                            isOperand = true;
                            isOperator = false;
                            sb.append(now);
                        }
                    }
                }
                while (!stackIsEmpty()) {
                    char c = pop();
                    if (c == '(') {
                        error = true;
                        break;
                    }
                    sb.append(c);
                }
                if (error) {
                    bw.append("Syntax Error!");
                } else {
                    bw.append(sb.toString());
                }
            } else {
                bw.append("Lexical Error!");
            }
            bw.newLine();
        }
        bw.flush();
    }

    static boolean isValidLexical(String infix) {
        Pattern p = Pattern.compile("[^,\\^,a-z,A-Z,0-9,\\+,\\-,\\*,/,<,>,\\.,#,=,(,),\\|]");
        Matcher m = p.matcher(infix);
        if (m.find()) {
            return false;
        }
        return true;
    }

    static char pop() {
        char c = stack[top];
        top--;
        return c;
    }

    static void push(char operator) {
        top++;
        stack[top] = operator;
    }

    static boolean stackIsEmpty() {
        return top == -1;
    }

}
