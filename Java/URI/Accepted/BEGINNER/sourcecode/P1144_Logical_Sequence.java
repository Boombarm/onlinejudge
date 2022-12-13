package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1144 Logical Sequence https://www.urionlinejudge.com.br/judge/en/problems/view/1144
//Accepted 14/08/2015 - 12:50:14 Runtime:0.140s
import java.util.Scanner;

public class P1144_Logical_Sequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " " + (i * i) + " " + (i * (i * i)));
            System.out.println(i + " " + ((i * i) + 1) + " " + ((i * (i * i) + 1)));
        }
    }

}
