package URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: DATA STRUCTURE AND LIBRARIES
 * @Problem: 2872 : TCP/IP Protocol
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2872
 * @Level: 1
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 10/3/18, 4:06:54 PM
 * @Runtime: 0.084s
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public class P2872_TCP_IP_Protocol {

    static LinkedList<Package> packages;

    static class Package implements Comparable {
        String id;

        public Package(String id) {
            this.id = id;
        }

        @Override
        public int compareTo(Object o) {
            Package pg = (Package) o;
            if (this.id.compareTo(pg.id) < 0) {
                return -1;
            } else if (this.id.compareTo(pg.id) > 0) {
                return 1;
            }
            return 0;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while ((br.readLine()) != null) {
            packages = new LinkedList<>();
            String packageId;
            while (!(input = br.readLine()).equals("0")) {
                String[] st = input.split(" ");
                packageId = st[1];
                packages.add(new Package(packageId));
            }
            Collections.sort(packages);

            for (Package p : packages) {
                bw.append("Package " + p.id + "\n");
            }
            bw.newLine();
        }
        bw.flush();
    }
}
