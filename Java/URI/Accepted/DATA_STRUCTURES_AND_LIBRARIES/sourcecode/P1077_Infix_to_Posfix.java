package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong Solution: Infix to Postfix Algorithm by Stack
 */
//URI Online Judge | 1077 Infix to Posfix https://www.urionlinejudge.com.br/judge/en/problems/view/1077
//Accepted 16/10/2015 - 03:06:20 Runtime:0.068s
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1077_Infix_to_Posfix {

    static char[] stack;
    static int top;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String infix = br.readLine();
            stack = new char[infix.length()];
            top = -1;
            for (int j = 0; j < infix.length(); j++) {
                char now = infix.charAt(j);
                if (now == '(') {
                    push(now);
                } else if (now == ')') {
                    while (!stackIsEmpty()) {
                        if (topStack() == '(') {
                            popStack();
                            break;
                        }
                        bw.append(popStack());
                    }
                } else if (now == '^') {
                    while (!stackIsEmpty() && topStack() == '^') {
                        bw.append(popStack());
                    }
                    push(now);
                } else if (now == '*') {
                    while (!stackIsEmpty() && (topStack() == '*' || topStack() == '/' || topStack() == '^')) {
                        bw.append(popStack());
                    }
                    push(now);
                } else if (now == '/') {
                    while (!stackIsEmpty() && (topStack() == '*' || topStack() == '/' || topStack() == '^')) {
                        bw.append(popStack());
                    }
                    push(now);
                } else if (now == '+' || now == '-') {
                    while (!stackIsEmpty() && (topStack() == '+' || topStack() == '-' || topStack() == '*' || topStack() == '/' || topStack() == '^')) {
                        bw.append(popStack());
                    }
                    push(now);
                } else {
                    bw.append(now);
                }
            }
            //pop all in Stack
            while (!stackIsEmpty()) {
                bw.append(popStack());
            }
            bw.newLine();
            bw.flush();
        }
    }

    static void push(char value) {
        top++;
        stack[top] = value;
    }

    static char popStack() {
        char c = stack[top];
        top--;
        return c;
    }

    static char topStack() {
        return stack[top];
    }

    static boolean stackIsEmpty() {
        return top == -1;
    }

}
