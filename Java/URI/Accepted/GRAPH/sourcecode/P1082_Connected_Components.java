package URI.Accepted.GRAPH.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: GRAPH
 * @Problem: 1082 : Connected Components
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1082
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 9/25/18, 12:10:59 PM
 * @Runtime: 0.312s
 * @Solution: Backtracking
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;

public class P1082_Connected_Components {


    static private class Component {
        char id;
        LinkedList<Component> link;
        boolean visited;

        public Component(char componentId) {
            this.id = componentId;
            link = new LinkedList<Component>();
            this.visited = false;
        }

        void addLink(Component component) {
            link.add(component);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "ISO-8859-1"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));
        int t = 1;
        int tc = Integer.parseInt(br.readLine());
        while (t <= tc) {
            String[] st = br.readLine().split(" ");
            int n = Integer.parseInt(st[0]);
            int m = Integer.parseInt(st[1]);
            Component[] component = new Component[n];
            for (int i = 'a', c = 0; c < n; i++, c++) {
                Component cc = new Component((char) i);
                component[c] = cc;
            }

            while (m-- > 0) {
                st = br.readLine().split(" ");
                char a = st[0].charAt(0);
                char b = st[1].charAt(0);
                component[a - 'a'].addLink(component[b - 'a']);
                component[b - 'a'].addLink(component[a - 'a']);
            }

            LinkedList<TreeSet> linkedSet = new LinkedList<TreeSet>();
            LinkedList<Component> Q = new LinkedList<Component>();
            for (Component cRoot : component) {
                if (!cRoot.visited) {
                    cRoot.visited = true;
                    Q.add(cRoot);
                    TreeSet<Character> componentSet = new TreeSet<Character>();
                    componentSet.add(cRoot.id);
                    while (!Q.isEmpty()) {
                        Component cur = Q.pollFirst();
                        for (Component c : cur.link) {
                            if (!c.visited) {
                                c.visited = true;
                                Q.add(c);
                                componentSet.add(c.id);
                            }
                        }
                    }
                    linkedSet.add(componentSet);
                }
            }


            bw.append("Case #" + t + ":\n");
            int countSet = 0;
            for (TreeSet s : linkedSet) {
                for (Object c : s) {
                    bw.append(c + ",");
                }
                bw.newLine();
                countSet++;
            }
            bw.append(countSet + " connected components\n\n");
            t++;
            bw.flush();
        }

    }
}
