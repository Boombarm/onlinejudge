package URI.Accepted.AD_HOC.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: AD-HOC
 * @Problem: 2693 : Van
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2693
 * @Level: 1
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 9/27/18, 5:41:00 PM
 * @Runtime: 0.080s
 * @Solution: 3 values sort
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class P2693_Van {

    static class Student implements Comparable {
        String name;
        char region;
        int cost;

        public Student(String name, char region, int cost) {
            this.name = name;
            this.region = region;
            this.cost = cost;
        }

        @Override
        public int compareTo(Object o) {
            Student student = (Student) o;
            if (this.cost > student.cost) {
                return 1;
            } else if (this.cost < student.cost) {
                return -1;
            } else if (this.region > student.region) {
                return 1;
            } else if (this.region < student.region) {
                return -1;
            } else if (this.name.compareTo(student.name) > 0) {
                return 1;
            } else if (this.name.compareTo(student.name) < 0) {
                return -1;
            }

            return 0;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while ((input = br.readLine()) != null) {
            int n = Integer.parseInt(input.trim());
            Student[] students = new Student[n];
            for (int i = 0; i < n; i++) {
                String[] st = br.readLine().split(" ");
                String name = st[0];
                char region = st[1].charAt(0);
                int cost = Integer.parseInt(st[2]);
                students[i] = new Student(name, region, cost);
            }
            Arrays.sort(students);
            for (Student s : students) {
                bw.append(s.name + "\n");
            }
        }
        bw.flush();
    }
}
