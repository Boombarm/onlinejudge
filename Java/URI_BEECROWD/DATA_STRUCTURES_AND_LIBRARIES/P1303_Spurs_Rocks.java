/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: DATA STRUCTURES AND LIBRARIES
 * @Problem: 1303 - Spurs Rocks
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1303
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 4/8/17, 2:58:38 AM
 * @Runtime:  0.076s
 * @Solution: quickSort
 * @Note:
 */
package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1303_Spurs_Rocks {

    static int n;
    static Team[] team;

    private static void quickSort(Team[] team, int left, int rigth) {
        if (left >= rigth) {
            return;
        }
        int j = partition(team, left, rigth);
        quickSort(team, left, j - 1);//sort left to pivot-1
        quickSort(team, j + 1, rigth);//sort pivot+1 to rigth 
    }

    @SuppressWarnings("empty-statement")
    private static int partition(Team[] team, int left, int rigth) {
        Team pivot = team[left];
        int i = left;
        int j = rigth + 1;
        while (i < j) {
            while (compare(team[--j], pivot) > 0);// team > p  ,add to rigth
            while (compare(team[++i], pivot) < 0) {// team < p , add to left
                if (i == rigth) {
                    break;
                }
            }
            if (i < j) {
                swap(i, j);
            }
        }
        swap(left, j);
        return j;
    }

    private static int compare(Team t1, Team t2) {
        if (t1.score != t2.score) {
            return t2.score - t1.score;
        } else {
            double t1_average = t1.goal / t1.lose;
            double t2_average = t2.goal / t2.lose;
            if (t1_average != t2_average) {
                if (t1_average > t2_average) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (t1.goal != t2.goal) {
                return (int) (t2.goal - t1.goal);
            } else {
                return t2.id - t1.id;
            }
        }
    }

    private static void swap(int i, int j) {
        Team tmp = team[i];
        team[i] = team[j];
        team[j] = tmp;
    }

    static class Team {

        int id;
        int score;
        double goal;
        double lose;
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        String input = br.readLine();
        int test = 1;
        while (!(input).equals("0")) {
            n = Integer.parseInt(input);
            int totalmatch = (n * (n - 1)) / 2;
            team = new Team[n];
            for (int i = 0; i < n; i++) {
                team[i] = new Team();
                team[i].id = i + 1;
            }
            while (totalmatch-- > 0) {
                String[] st = br.readLine().split(" ");
                int t1 = Integer.parseInt(st[0]) - 1;//team
                int s1 = Integer.parseInt(st[1]);//score
                int t2 = Integer.parseInt(st[2]) - 1;//team  
                int s2 = Integer.parseInt(st[3]);//score
                if (s1 > s2) {
                    team[t1].score += 2;
                    team[t2].score++;
                } else {
                    team[t2].score += 2;
                    team[t1].score++;
                }
                team[t1].goal += s1;
                team[t1].lose += s2;
                team[t2].goal += s2;
                team[t2].lose += s1;
            }
            quickSort(team, 0, n - 1);
            bw.append("Instancia " + (test++) + "\n");
            int i = 0;
            for (; i < n - 1; i++) {
                bw.append(team[i].id + " ");
            }
            bw.append(team[i].id + "\n");
            input = br.readLine();
            if (input.equals("0")) {
                break;
            }
            bw.newLine();
        }
        bw.flush();
    }

}
