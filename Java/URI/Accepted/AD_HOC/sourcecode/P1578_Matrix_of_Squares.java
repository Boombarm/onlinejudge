/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1578 Matrix of Squares
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1578
 * @Status: Accepted 18/10/2015 - 09:39:24 Runtime:0.132s 
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class P1578_Matrix_of_Squares {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 4; i < 4 + t; i++) {
            int size = Integer.parseInt(br.readLine());
            BigInteger[][] matrix = new BigInteger[size][size];
            int[] length = new int[size];
            for (int j = 0; j < size; j++) {
                String[] st = br.readLine().split(" ");
                for (int k = 0; k < size; k++) {
                    matrix[j][k] = getDeterminant(Long.parseLong(st[k]));
                    if (matrix[j][k].toString().length() > length[k]) {
                        length[k] = matrix[j][k].toString().length();
                    }
                }
            }

            bw.append("Quadrado da matriz #" + i + ":");
            bw.newLine();
            for (int j = 0; j < matrix.length; j++) {
                for (int k = 0; k < matrix.length; k++) {
                    if (k > 0) {
                        bw.append(" ");
                    }
                    String s = matrix[j][k].toString();
                    if (s.length() < length[k]) {
                        bw.append(setBlankspace(s, length[k]));
                    } else {
                        bw.append(s);
                    }
                }
                bw.newLine();
            }
            if (i < (4 + t) - 1) {
                bw.newLine();
            }
            bw.flush();
        }
    }

    static BigInteger getDeterminant(long number) {
        if (number <= 1) {
            return BigInteger.valueOf(number);
        } else {
            return BigInteger.valueOf(number).pow(2);
        }
    }

    static String setBlankspace(String print, int maxSize) {
        for (int l = print.length(); l < maxSize; l++) {
            print = " " + print;
        }
        return print;
    }

}
