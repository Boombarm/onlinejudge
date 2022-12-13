/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1960 Roman Numerals for Page Numbers
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1960
 * @Timelimit: 1 sec
 * @Status: Accepted 06/11/2015 - 10:11:27 Runtime:0.052s
 * @Solution:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1960_Roman_Numerals_for_Page_Numbers {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = Integer.parseInt(br.readLine());
        while (number != 0) {
            if (number >= 900) {
                bw.append("CM");
                number -= 900;
            } else if (number >= 500) {
                bw.append('D');
                number -= 500;
            } else if (number >= 400) {
                bw.append("CD");
                number -= 400;
            } else if (number >= 100) {
                bw.append('C');
                number -= 100;
            } else if (number >= 90) {
                bw.append("XC");
                number -= 90;
            } else if (number >= 50) {
                bw.append('L');
                number -= 50;
            } else if (number >= 40) {
                bw.append("XL");
                number -= 40;
            } else if (number >= 10) {
                bw.append('X');
                number -= 10;
            } else if (number >= 9) {
                bw.append("IX");
                number -= 9;
            } else if (number >= 5) {
                bw.append('V');
                number -= 5;
            } else if (number >= 4) {
                bw.append("IV");
                number -= 4;
            } else {
                bw.append('I');
                number--;
            }
        }
        bw.newLine();
        bw.flush();
    }

}
