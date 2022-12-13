/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: STRUCTURES
 * @Problem: 1340 - I Can Guess the Data Structure!
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1340
 * @Timelimit: 2 sec
 * @Status: Accepted
 * @Submission: 3/24/17, 8:04:14 PM
 * @Runtime: 0.080s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class P1340_I_Can_Guess_the_Data_Structure {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        String input;
        while ((input = br.readLine()) != null) {
            int n = Integer.parseInt(input);
            int[] stack = new int[n];
            int top = -1;
            LinkedList<Integer> queue = new LinkedList<Integer>();
            PriorityQueue<Integer> priorityQueue = new PriorityQueue(n, Collections.reverseOrder());
            boolean guess_stack = true;
            boolean guess_queue = true;
            boolean guess_priorityQueue = true;
            int canUse = 3;
            while (n-- > 0) {
                String[] st = br.readLine().split(" ");
                int x = Integer.parseInt(st[0]);
                int number = Integer.parseInt(st[1]);

                switch (x) {
                    case 1:
                        if (guess_stack) {
                            stack[++top] = number;
                        }

                        if (guess_queue) {
                            queue.add(number);
                        }

                        if (guess_priorityQueue) {
                            priorityQueue.offer(number);
                        }
                        break;
                    case 2:
                        if (guess_stack) {
                            if (stack[top] != number) {
                                guess_stack = false;
                                canUse--;
                            } else {
                                top--;
                            }
                        }

                        if (guess_queue) {
                            if (queue.peek() != number) {
                                guess_queue = false;
                                canUse--;
                            } else {
                                queue.poll();
                            }
                        }

                        if (guess_priorityQueue) {
                            if (priorityQueue.peek() != number) {
                                guess_priorityQueue = false;
                                canUse--;
                            } else {
                                priorityQueue.poll();
                            }
                        }
                        break;
                }
            }
            if (canUse > 1) {
                bw.append("not sure\n");
            } else if (guess_stack) {
                bw.append("stack\n");
            } else if (guess_queue) {
                bw.append("queue\n");
            } else if (guess_priorityQueue) {
                bw.append("priority queue\n");
            } else {
                bw.append("impossible\n");
            }
        }
        bw.flush();
    }

}
