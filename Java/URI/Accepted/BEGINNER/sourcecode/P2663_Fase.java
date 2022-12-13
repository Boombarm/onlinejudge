package  URI.Accepted.BEGINNER.sourcecode;


/**
 * Created by teerapat on 2/7/2018.
 * Answer : Accepted
 * Runtime : 0.036s
 * Submission : 2/7/18, 10:45:45 PM
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2663_Fase {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        int[] score = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = Integer.parseInt(br.readLine());
            for (int j = i - 1, h = i; j >= 0; j--, h--) {
                if (score[j] < score[h]) {
                    int tmp = score[j];
                    score[j] = score[h];
                    score[h] = tmp;
                }
            }
        }


        int lastScore = score[k - 1];
        int total = k;
        for (int i = k; i < n; i++) {
            if (score[i] == lastScore) {
                total++;
            } else {
                break;
            }
        }

        System.out.println(total);

    }
}
