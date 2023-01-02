/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: GRAPH
 * @Problem: 1610 : Dudu Service Maker
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1610
 * @Level: 2
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 1/2/19, 8:06:10 PM
 * @Runtime: 1.372s
 * @Solution: DFS for find Cycle
 * @Note:
 */
package URI.Accepted.GRAPH.sourcecode;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.TreeMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Map;

public class P1610_Dudu_Service_Maker {

    static boolean looping;

    static private class Component {
        int id;
        char color;//W = White, G  = Gray , B = Black
        LinkedList<Component> link;

        public Component(int id) {
            this.id = id;
            link = new LinkedList<>();
            color = 'W';
        }

        void addLink(Component component) {
            link.add(component);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        int n, m;
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            m = sc.nextInt();
            TreeMap<Integer, Component> component = new TreeMap<>();
            int a, b;
            while (m-- > 0) {
                a = sc.nextInt();
                b = sc.nextInt();
                if (a > n || b > n) continue;
                Component componentA = component.get(a);
                Component componentB = component.get(b);
                if (componentA == null) {
                    componentA = new Component(a);
                }

                if (componentB == null) {
                    componentB = new Component(b);
                }
                componentA.addLink(componentB);
                component.put(a, componentA);
                component.put(b, componentB);
            }

            looping = false;
            loop:
            for (Map.Entry<Integer, Component> entry : component.entrySet()) {
                Component e = entry.getValue();
                DFS_findCycle(e);
                if (looping) break;
            }

            bw.append((looping ? "SIM" : "NAO") + "\n");

        }
        bw.flush();
    }


    static void DFS_findCycle(Component c) {
        c.color = 'G';
        for (Component children : c.link) {
            if (children.color == 'G') {
                looping = true;
                return;
            }
            if (children.color == 'W') {
                DFS_findCycle(children);
            }
        }
        c.color = 'B';
    }

}
