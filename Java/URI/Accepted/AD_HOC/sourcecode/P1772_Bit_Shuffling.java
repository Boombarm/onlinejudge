/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1772 Bit Shuffling
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1772
 * @Status: Accepted 24/10/2015 - 01:40:16 Runtime:0.616s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1772_Bit_Shuffling {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while ((line = br.readLine()) != null) {
            if (line.equals("0 0")) {
                break;
            }
            String[] st = line.split(" ");
            long number = Long.parseLong(st[0]);
            int permutations = Integer.parseInt(st[1]);
            long max = number, min = number, res = number;
            int[] number32bit = base2(number);
            for (int i = 0; i < permutations; i++) {
                String[] st2 = br.readLine().split(" ");
                int index1 = Integer.parseInt(st2[0]);
                int index2 = Integer.parseInt(st2[1]);
                if (number32bit[31 - index1] != number32bit[31 - index2]) {
                    int temp = number32bit[31 - index1];
                    number32bit[31 - index1] = number32bit[31 - index2];
                    number32bit[31 - index2] = temp;
                    res = base10(number32bit);
                    if (res > max) {
                        max = res;
                    }
                    if (res < min) {
                        min = res;
                    }
                }

            }
            System.out.println(res + " " + max + " " + min);
        }
    }

    static int[] base2(long number) {
        int[] base2 = new int[32];
        int count = 31;
        for (long n = number, i = 31; n > 0; n /= 2) {
            long r = n % 2;
            base2[count] = (int) r;
            count--;
        }
        return base2;
    }

    static long base10(int[] base2Arr) {
        long base10 = 0;
        for (int i = 31; i >= 0; i--) {
            base10 += base2Arr[i] == 1 ? Math.pow(2, 31 - i) : 0;
        }
        return base10;
    }

}
