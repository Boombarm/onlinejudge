package ZOJ;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: ZOJ
 * @Problem: 1099 HTML
 * @Link: http://acm.zju.edu.cn/onlinejudge/showProblem.do?problemId=99
 * @Timelimit: 2 Seconds
 * @Status: Accepted
 * @Submission: 2015-06-05 23:21:42
 * @Runtime: 36 ms
 * @Solution:
 * @Note:
 */

import java.util.Scanner;

public class P1099_HTML {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean checkElement = false;
        String line = "";
        String word = "";
        while (sc.hasNext()) {
            word = sc.next();
            line += " " + word;
            line = line.trim();
            if (word.equals("<br>")) {
                System.out.println();
                line = "";
                checkElement = true;
                continue;
            } else if (word.equals("<hr>")) {
                String hr = "--------------------------------------------------------------------------------";
                System.out.println((checkElement ? hr : "\n" + hr));
                line = "";
                checkElement = true;
                continue;
            } else if (line.length() > 80) {
                System.out.print("\n" + word);
                line = word;
            } else {
                System.out.print((line.contains(" ") ? " " + word : word));
            }
            checkElement = false;
        }
        System.out.println();
    }
}
