package URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2929 - Smallest on the Stack
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2929
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/31/19, 12:28:21 AM
 * @Runtime: 1.056s
 * @Solution: binary tree
 * @Note: Stack by LinkedList  +  Minheap
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class P2929_Smallest_on_the_Stack {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        LinkedList<Integer> stack = new LinkedList<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] st = br.readLine().split(" ");
            switch (st[0]) {
                case "PUSH":
                    int x = Integer.parseInt(st[1]);
                    stack.add(x);
                    minHeap.add(x);
                    break;
                case "MIN":
                    if (stack.isEmpty()) {
                        bw.append("EMPTY\n");
                        continue;
                    }
                    bw.append(minHeap.peek() + "\n");
                    break;
                case "POP":
                    if (stack.isEmpty()) {
                        bw.append("EMPTY\n");
                        continue;
                    }
                    minHeap.remove(stack.removeLast());
                    break;
            }
        }
        bw.flush();
    }

}
