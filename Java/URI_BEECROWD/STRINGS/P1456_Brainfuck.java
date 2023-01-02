/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1456 Brainfuck
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1456
 * @Timelimit: 1 sec
 * @Status: Accepted 01/12/2015 - 12:45:01 Runtime:0.068s
 * @Solution: BrainFuck Programming
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P1456_Brainfuck {

    static char[] commands;
    static byte[] memory, input;
    static int pointer, readIndex;
    final static char NEXT = '>';
    final static char BACK = '<';
    final static char INCREMENT = '+';
    final static char DECREMENT = '-';
    final static char READ = ',';
    final static char START_LOOP = '[';
    final static char END_LOOP = ']';
    final static char PRINT = '.';
    final static char PRINT_FIRST_TEN = '#';

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            br.readLine();
            memory = new byte[30000];
            pointer = 0;
            input = br.readLine().getBytes();
            readIndex = 0;
            commands = br.readLine().toCharArray();

            out.write(("Instancia " + i + "\n").getBytes());
            int instruction = 0;
            do {
                switch (commands[instruction]) {
                    case NEXT:
                        pointer++;
                        if (pointer > 29999) {
                            pointer = 0;
                        }
                        break;
                    case BACK:
                        pointer--;
                        if (pointer < 0) {
                            pointer = 29999;
                        }
                        break;
                    case INCREMENT:
                        memory[pointer]++;
                        break;
                    case DECREMENT:
                        memory[pointer]--;
                        break;
                    case READ:
                        if (readIndex < input.length) {
                            memory[pointer] = input[readIndex];
                            readIndex++;
                        } else {
                            memory[pointer] = 0;
                        }
                        break;
                    case PRINT:
                        out.write((byte) memory[pointer]);
                        break;
                    case PRINT_FIRST_TEN:
                        for (int k = 0; k < 10; k++) {
                            out.write((byte) memory[pointer]);
                        }
                        break;
                    case START_LOOP:
                        if (memory[pointer] == 0) {
                            int nesting = 0;
                            while (true) {
                                ++instruction;
                                if (commands[instruction] == '[') {
                                    ++nesting;
                                } else if (nesting > 0 && commands[instruction] == ']') {
                                    --nesting;
                                } else if (commands[instruction] == ']' && nesting == 0) {
                                    break;
                                }
                            }
                        }
                        break;
                    case END_LOOP:
                        if (memory[pointer] != 0) {
                            int nesting = 0;

                            while (true) {
                                --instruction;

                                if (commands[instruction] == ']') {
                                    ++nesting;
                                } else if (nesting > 0 && commands[instruction] == '[') {
                                    --nesting;
                                } else if (commands[instruction] == '[' && nesting == 0) {
                                    break;
                                }
                            }
                        }
                        break;
                }
            } while (++instruction < commands.length);

            out.write("\n\n".getBytes());
            out.flush();
        }
        out.flush();
    }

}
