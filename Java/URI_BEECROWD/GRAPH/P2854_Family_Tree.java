package URI.Accepted.GRAPH.sourcecode;


/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: GRAPH
 * @Problem: 2854 - Family Tree
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2854
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory:
 * @Submission: 2/25/19, 5:37:32 PM
 * @Runtime: 0.100s
 * @Solution: unionSet
 * @Note:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class P2854_Family_Tree {

    static int m, n;
    static int[] p;

    private static class Node {
        int id;
        String name;
        LinkedList<Node> relation;

        public Node(int id, String name) {
            this.id = id;
            this.name = name;
            this.relation = new LinkedList<>();
        }


        void addRelation(Node node) {
            this.relation.add(node);
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        m = Integer.parseInt(st[0]);
        n = Integer.parseInt(st[1]);
        HashMap<String, Node> Human = new HashMap();

        int humanId = 1;
        for (int i = 0; i < n; i++) {
            st = br.readLine().split(" ");
            String nameA = st[0];
            String relation = st[1];
            String nameB = st[2];
            Node humanA = Human.get(nameA);
            Node humanB = Human.get(nameB);
            if (humanA == null) {
                humanA = new Node(humanId, nameA);
                Human.put(nameA, humanA);
                humanId++;
            }

            if (humanB == null) {
                humanB = new Node(humanId, nameB);
                Human.put(nameB, humanB);
                humanId++;
            }

            humanA.addRelation(humanB);
            humanB.addRelation(humanA);

        }

        boolean[] v = new boolean[m + 1];
        p = new int[m + 1];
        for (int i = 1; i <= m; i++) {
            p[i] = i;
        }

        for (Map.Entry<String, Node> entry : Human.entrySet()) {
            Node cur = entry.getValue();
            LinkedList<Node> Q = new LinkedList<>();
            if (v[cur.id]) continue;
            Q.add(cur);
            v[cur.id] = true;
            while (!Q.isEmpty()) {
                Node node = Q.poll();
                int setA = findFamily(node.id);
                for (Node curLink : node.relation) {
                    if (v[curLink.id]) continue;
                    v[curLink.id] = true;
                    int setB = findFamily(curLink.id);
                    unionSet(setA, setB);
                    Q.add(curLink);
                }

            }
        }

        int totalFamily = 0;
        for (int i = 1; i <= m; i++) {
            if (p[i] == i) totalFamily++;
        }
        System.out.println(totalFamily);
    }


    static int findFamily(int pId) {
        if (p[pId] == pId) return pId;
        return findFamily(p[pId]);
    }

    static void unionSet(int s, int t) {
        p[t] = s;
    }


}
