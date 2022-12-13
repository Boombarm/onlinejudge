package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1145 Logical Sequence 2 https://www.urionlinejudge.com.br/judge/en/problems/view/1145
//Accepted 14/08/2015 - 13:28:10 Runtime:0.192s
import java.util.Scanner;

public class P1145_Logical_Sequence_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        if (N1 > 1 && N1 < 20 && N2 > N1 && N2 < 100000) {
            for (int i = 1; i <= N2; i++) {
                if (i % N1 == 0) {
                    System.out.println(i);
                } else {
                    System.out.print(i + " ");
                }
            }
        }
    }

}
