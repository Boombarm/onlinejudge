/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: Ad-Hoc
 * @Problem: 2315 - Easy Difference Between Dates
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2315
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 2/15/17, 5:15:48 PM
 * @Runtime: 0.040s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2315_Easy_Difference_Between_Dates {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int day1 = Integer.parseInt(st[0]);
        int month1 = Integer.parseInt(st[1]);
        st = br.readLine().split(" ");
        int day2 = Integer.parseInt(st[0]);
        int month2 = Integer.parseInt(st[1]);
        int result = 0;
        if (month1 == month2) {
            if (day1 != day2) {
                result = day1 > day2 ? day1 - day2 : day2 - day1;
            }
        } else {
            if (month1 > month2) {
                int tmp = month2;
                month2 = month1;
                month1 = tmp;
                tmp = day2;
                day2 = day1;
                day1 = tmp;
            }
            int DifferenceMonth = (month2 - month1) - 1;
            result = getDayOfMonth(month1) - day1;
            month1++;
            while (DifferenceMonth-- > 0) {
                result += getDayOfMonth(month1);
                month1++;
            }
            result += day2;
        }
        System.out.println(result);
    }

    static int getDayOfMonth(int month) {
        switch (month) {
            case 1:
                return 31;
            case 2:
                return 28;
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
        }
        return 0;
    }

}
