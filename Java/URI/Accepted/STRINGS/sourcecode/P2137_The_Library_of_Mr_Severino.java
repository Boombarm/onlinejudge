package  URI.Accepted.STRINGS.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: String
 * @Problem: 2137 The Library of Mr. Severino
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2137
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 1/16/17, 12:19:47 AM
 * @Runtime: 0.044s
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2137_The_Library_of_Mr_Severino {

    static String number[];
    static int length;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String hasNext;
        while ((hasNext = br.readLine()) != null) {
            int n = Integer.parseInt(hasNext);
            number = new String[n];
            while (n-- > 0) {
                number[n] = br.readLine();
            }
            sort(number);
            for (String num : number) {
                bw.append(num + "\n");
            }
        }
        bw.flush();
    }

    static void sort(String[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        number = array;
        length = array.length;
        quickSort(0, length - 1);
    }

    static void quickSort(int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;
        String pivot = number[lowerIndex + (higherIndex - lowerIndex) / 2];

        while (i <= j) {
            while (number[i].compareToIgnoreCase(pivot) < 0) {
                i++;
            }

            while (number[j].compareToIgnoreCase(pivot) > 0) {
                j--;
            }

            if (i <= j) {
                exchangeNumber(i, j);
                i++;
                j--;
            }
        }
        //call quickSort recursively
        if (lowerIndex < j) {
            quickSort(lowerIndex, j);
        }
        if (i < higherIndex) {
            quickSort(i, higherIndex);
        }
    }

    static void exchangeNumber(int i, int j) {
        String temp = number[i];
        number[i] = number[j];
        number[j] = temp;
    }

}
