package URI.Accepted.BEGINNER.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: BEGINNER
 * @Problem: 2761 - Input and Output of Various Types
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2761
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 2/6/19, 12:01:06 AM
 * @Runtime: 0.076s
 * @Solution:
 * @Note:
 */


import java.util.Scanner;

public class P2761_Input_and_Output_of_Various_Types {

    static int a;
    static float b;
    static char c;
    static String d;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextFloat();
        c = sc.next().charAt(0);

        String[] st = sc.nextLine().split("");
        String d = "";
        for (int i = 1; i < st.length; i++) {
            d += st[i];
        }

        System.out.printf("%d%.6f%c%s\n", a, b, c, d);
        System.out.printf("%d\t%.6f\t%c\t%s\n", a, b, c, d);
        System.out.printf("%10d%10.6f%10c%10s\n", a, b, c, d);
    }


}
