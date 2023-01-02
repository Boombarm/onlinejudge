/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1726 Friends
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1726
 * @Timelimit: 1 sec
 * @Status: Accepted 03/12/2015 - 09:19:18 Runtime:0.032s
 * @Solution: Infix to postfix and postfix parser
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class P1726_Friends {

    static LinkedList<Character> postfixStack;
    static LinkedList<String> parsingStack;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while ((input = br.readLine()) != null) {
            postfixStack = new LinkedList<Character>();
            parsingStack = new LinkedList<String>();
            String postfix = infixToPostfix(input);
            String result = resulting(postfix);
            bw.append(result + "\n");
        }
        bw.flush();
    }

    static String infixToPostfix(String infix) {
        String postfix = "";
        int i = 0;
        do {
            char now = infix.charAt(i);
            switch (now) {
                case '(':
                    postfixStack.push('(');
                    break;
                case ')':
                    while (true) {
                        if (postfixStack.peek() == '(') {
                            postfixStack.pop();
                            break;
                        }
                        postfix += postfixStack.pop();
                    }
                    break;
                case '*':
                    while (!postfixStack.isEmpty() && postfixStack.peek() == '*') {
                        postfix += postfixStack.pop();
                    }
                    postfixStack.push('*');
                    break;
                case '+':
                    while (!postfixStack.isEmpty() && (postfixStack.peek() == '-'
                            || postfixStack.peek() == '+'
                            || postfixStack.peek() == '*')) {
                        postfix += postfixStack.pop();
                    }
                    postfixStack.push('+');
                    break;
                case '-':
                    while (!postfixStack.isEmpty() && (postfixStack.peek() == '-'
                            || postfixStack.peek() == '+'
                            || postfixStack.peek() == '*')) {
                        postfix += postfixStack.pop();
                    }
                    postfixStack.push('-');
                    break;
                default:
                    postfix += now;
                    break;
            }
        } while (++i < infix.length());
        while (!postfixStack.isEmpty()) {
            postfix += postfixStack.pop();
        }
        return postfix;
    }

    static String resulting(String postfix) {
        String build = "";
        String operand1, operand2;
        int i = 0;
        do {
            char now = postfix.charAt(i);
            switch (now) {
                case '{':
                    break;
                case '}':
                    parsingStack.add(build);
                    build = "";
                    break;
                case '*':
                    operand2 = parsingStack.removeLast();
                    operand1 = parsingStack.removeLast();
                    parsingStack.add(intersection(operand1, operand2));
                    break;
                case '+':
                    operand2 = parsingStack.removeLast();
                    operand1 = parsingStack.removeLast();
                    parsingStack.add(union(operand1, operand2));
                    break;
                case '-':
                    operand2 = parsingStack.removeLast();
                    operand1 = parsingStack.removeLast();
                    parsingStack.add(difference(operand1, operand2));
                    break;
                default:
                    build += now;
                    break;
            }
        } while (++i < postfix.length());
        return "{" + parsingStack.remove() + "}";
    }

    static String union(String text1, String text2) {
        String result = text1;
        int i = 0;
        while (i < text2.length()) {
            char c = text2.charAt(i);
            boolean found = false;
            //finding in result
            for (int j = 0; j < result.length(); j++) {
                if (c == result.charAt(j)) {
                    found = true;
                    break;
                }
            }

            //add to result if notfound
            if (!found) {
                boolean add = false;
                for (int j = 0; j < result.length(); j++) {
                    if (c < result.charAt(j)) {
                        result = result.substring(0, j) + c + result.substring(j);
                        add = true;
                        break;
                    }
                }
                if (!add) {
                    result += c;
                }
            }
            i++;
        }
        return sorting(result);
    }

    static String difference(String text1, String text2) {
        String result = text1;
        int i = 0;
        while (i < text2.length()) {
            char c = text2.charAt(i);
            while (true) {
                boolean found = false;
                int j = 0;
                for (; j < result.length(); j++) {
                    if (c == result.charAt(j)) {
                        found = true;
                        break;
                    }
                }
                if (found) {
                    for (; j < result.length(); j++) {
                        if (c == result.charAt(j)) {
                            result = result.substring(0, j) + result.substring(j + 1);
                        }
                    }
                    continue;
                }
                break;
            }
            i++;
        }
        return sorting(result);
    }

    static String intersection(String text1, String text2) {
        String result = "";
        for (int i = 0; i < text1.length(); i++) {
            char c = text1.charAt(i);
            for (int j = 0; j < text2.length(); j++) {
                if (c == text2.charAt(j) && result.indexOf(c) == -1) {
                    result += c;
                }
            }
        }
        return sorting(result);
    }

    static String sorting(String result) {
        char[] temp = result.toCharArray();
        while (true) {
            boolean swap = false;
            for (int j = 0; j < temp.length - 1; j++) {
                if (temp[j] > temp[j + 1]) {
                    char c = temp[j];
                    temp[j] = temp[j + 1];
                    temp[j + 1] = c;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
        return new String(temp);
    }

}
