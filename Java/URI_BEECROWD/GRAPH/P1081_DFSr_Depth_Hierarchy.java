package URI.Accepted.GRAPH.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: GRAPH
 * @Problem: 1081 - DFSr Depth Hierarchy
 * @Link: https://www.urionlinejudge.com.br/repository/UOJ_1081_en.html
 * @Level: 3
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 10/3/18, 1:52:07 PM
 * @Memory: 3.11 KB
 * @Runtime: 0.088s
 * @Solution: GRAPH Travel or by Level
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.TreeSet;

public class P1081_DFSr_Depth_Hierarchy {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n, m;
    static Vertices[] vertices;
    static LinkedList<Vertices> Q;

    static class Vertices implements Comparable {
        int id;
        boolean visited;
        TreeSet<Vertices> link;
        Vertices parent;
        int level = 0;

        public Vertices(int id) {
            link = new TreeSet<>();
            this.id = id;
        }

        public void setParent(Vertices parent) {
            this.parent = parent;
        }

        void setVisited() {
            this.visited = true;
        }

        void addLink(Vertices v) {
            if (!link.contains(v)) {
                link.add(v);
            }
        }

        void setLevel(int level) {
            this.level = level;
        }

        @Override
        public int compareTo(Object o) {
            Vertices v = (Vertices) o;
            if (this.id > v.id) {
                return 1;
            } else if (this.id < v.id) {
                return -1;
            }
            return 0;
        }
    }

    public static void main(String[] args) throws IOException {

        int tc = Integer.parseInt(br.readLine());
        int c = 1;
        while (tc-- > 0) {
            String[] st = br.readLine().split(" ");
            n = Integer.parseInt(st[0]);
            m = Integer.parseInt(st[1]);
            vertices = new Vertices[n];
            for (int i = 0; i < n; i++) {
                vertices[i] = new Vertices(i);
            }

            for (int i = 0; i < m; i++) {
                st = br.readLine().split(" ");
                int v1 = Integer.parseInt(st[0]);
                int v2 = Integer.parseInt(st[1]);
                vertices[v1].addLink(vertices[v2]);
            }

            bw.append("Caso " + c + ":\n");
            Q = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                if (!vertices[i].visited && vertices[i].link.size() > 0) {
                    vertices[i].setLevel(2);
                    travel(vertices[i]);
                    bw.newLine();
                }
            }
            bw.flush();
            c++;
        }
        bw.flush();
    }

    static void travel(Vertices v) throws IOException {
        v.setVisited();
        for (Vertices vchild : v.link) {
            for (int i = 0; i < v.level; i++) {
                bw.append(" ");
            }

            if (!vchild.visited) {
                vchild.setLevel(v.level + 2);
                bw.append(v.id + "-" + vchild.id + " pathR(G," + vchild.id + ")\n");
                travel(vchild);
            } else {
                bw.append(v.id + "-" + vchild.id + "\n");
            }
        }
    }

}
