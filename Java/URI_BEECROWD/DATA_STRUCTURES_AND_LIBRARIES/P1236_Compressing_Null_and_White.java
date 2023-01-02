/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: STRUCTURES 
 * @Problem: 1236 - Compressing Null and White
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1236
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 4/5/17, 8:43:50 PM
 * @Runtime: 0.052s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1236_Compressing_Null_and_White {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in, "ISO-8859-1");
        OutputStreamWriter ow = new OutputStreamWriter(System.out, "ISO-8859-1");
        BufferedReader br = new BufferedReader(ir);
        BufferedWriter bw = new BufferedWriter(ow);
        int count;
        int testcase = Integer.parseInt(br.readLine());
        while (testcase-- > 0) {
            char[] letter = br.readLine().toCharArray();
            int size = letter.length;
            for (int i = 0; i < size;) {
                char c = letter[i];
                switch (c) {
                    case ' ':
                        count = 1;
                        i++;
                        for (; i < size;) {
                            if (letter[i] != ' ') {
                                break;
                            }
                            count++;
                            i++;
                        }
                        switch (count) {
                            case 1:
                                bw.append(" ");
                                break;
                            case 2:
                                bw.append("  ");
                                break;
                            default:
                                while (count > 0) {
                                    bw.append("$");
                                    bw.append(((char) min(count)));
                                    count -= 255;
                                }
                                break;
                        }
                        break;
                    case '0':
                        count = 1;
                        i++;
                        for (; i < size;) {
                            if (letter[i] != '0') {
                                break;
                            }
                            count++;
                            i++;
                        }
                        switch (count) {
                            case 1:
                                bw.append("0");
                                break;
                            case 2:
                                bw.append("00");
                                break;
                            default:
                                while (count > 0) {
                                    bw.append("#");
                                    bw.append(((char) min(count)));
                                    count -= 255;
                                }
                                break;
                        }
                        break;
                    default:
                        i++;
                        bw.append(c);
                        break;
                }
            }
            bw.newLine();
        }
        bw.flush();
    }

    static int min(int n) {
        return n > 255 ? 255 : n;
    }

}
